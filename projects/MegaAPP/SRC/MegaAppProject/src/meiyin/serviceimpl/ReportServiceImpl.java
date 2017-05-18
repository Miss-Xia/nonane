package meiyin.serviceimpl;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import meiyin.domain.LongText;
import meiyin.domain.Reference;
import meiyin.domain.ReportMeta;
import meiyin.domain.ReportMetaExample;
import meiyin.domain.ReportMetaExample.Criteria;
import meiyin.domain.outdata.InSNP;
import meiyin.domain.outdata.OAdvice;
import meiyin.domain.outdata.OutAdvice;
import meiyin.domain.outdata.OutAdvices;
import meiyin.domain.outdata.OutAlladvice;
import meiyin.domain.outdata.risk.InRisk;
import meiyin.domain.outdata.risk.Inlevel;
import meiyin.domain.outdata.risk.Orisk;
import meiyin.domain.outdata.risk.OutItemRisk;
import meiyin.domain.outdata.risk.OutRisk;

import meiyin.mapper.ReportMapper;
import meiyin.mapper.ReportMetaMapper;
import meiyin.service.ReportService;

@Service
@Transactional
public class ReportServiceImpl<V, E> implements ReportService {
	@Autowired
	private ReportMapper reportMapper;
	@Autowired
	private ReportMetaMapper reportMetaMapper;

	/**
	 * 查询报告列表（检测列表）
	 * 
	 * @param accountId
	 * @return
	 */
	public List<Map<String, Object>> getReport(Integer accountId) {
		List<Map<String, Object>> list = reportMapper.getExamList(accountId);
		return list;
	}

	/**
	 * 根据reportid返回报告详情
	 */
	public Map<String, Object> getExamDetial(long reportId) {

		Map<String, Object> examDetial = reportMapper.getReport(reportId);
		// 自动转换Long
		Long suite_id = (Long) examDetial.get("suite_id");
		List<Map<String, Object>> itemList = reportMapper.getItemList(suite_id);
		examDetial.put("itemList", itemList);
		return examDetial;
	}

	// 单项详情
	public Map<String, Object> getRiskAndprec(String itemId, String reportId) {
		// 1.单项描述
		Long itemId1 = Long.valueOf(itemId);
		Map<String, Object> desc = reportMapper.getItemDesc(itemId1);
		// 2.SNP 检测结果
		InSNP inSNP = new InSNP();
		inSNP.setItemId(itemId);
		inSNP.setReportId(reportId);
		List<Map<String, Object>> snp = reportMapper.getSNP(inSNP);
		desc.put("snp", snp);

		List<LongText> arrayList = new ArrayList<LongText>();
		for (Map<String, Object> map : snp) {
			int desc_id = Integer.parseInt(map.get("desc_id").toString());
			LongText result = reportMapper.getResult(desc_id);
			arrayList.add(result);
		}
		Set<Reference> referenceSet = new HashSet<Reference>();
		Set<String> results = new HashSet<String>();

		List<String> result = new ArrayList<String>();
		for (LongText longText : arrayList) {
			results.add(longText.getContent());
			List<Reference> references = longText.getReferences();
			if (references != null && !references.isEmpty()) {
				for (Reference reference : references) {
					referenceSet.add(reference);
				}
			}
		}

		for (String string : results) {
			String temp = string;
			if (referenceSet != null && !referenceSet.isEmpty()) {
				int i = 1;
				for (Reference reference : referenceSet) {
					String md5Hash = reference.getMd5Hash();
					String string2 = temp
							.replaceAll(md5Hash, String.valueOf(i));
					temp = string2;
					i++;
				}
				result.add(temp);
			}
			
		}
		if (referenceSet != null && !referenceSet.isEmpty()) {
			int i = 1;
			for (Reference reference : referenceSet) {
				String content = reference.getContent();
				String index = "[" + i + "]";
				String des = index + content;
				reference.setContent(des);
				i++;
			}
		}
		desc.put("references", referenceSet);
		desc.put("result", result);
		
		
	
		
		// 预防建议
		List<Map<String, Object>> itemAdvice = reportMapper
				.getItemAdvice(itemId1);
		desc.put("itemAdvice", itemAdvice);

		// 单项风险等级

		Map<String, Object> itemName = reportMapper.getItemName(itemId1);
		String name = itemName.get("name").toString();
		String metaname = "risk_level_of_item_named_" + name;
		InRisk inRisk = new InRisk();
		inRisk.setMeta_key(metaname);
		inRisk.setReportId(reportId);
		Map<String, Object> risk = reportMapper.getItemRisk(inRisk);
		System.out.println(risk);
		String riskLevel = risk.get("meta_value").toString();
		Map<String, Object> level = reportMapper.getRiskLevel(riskLevel);
		String pic_id = level.get("pic_id").toString();

		String metaRisk = "risk_fold_of_item_named_" + name;
		InRisk inRisk1 = new InRisk();
		inRisk1.setMeta_key(metaRisk);
		inRisk1.setReportId(reportId);
		Map<String, Object> metaRisk1 = reportMapper.getItemRisk(inRisk1);
		String times = metaRisk1.get("meta_value").toString();

		Orisk orisk = new Orisk();
		orisk.setLevel(riskLevel);
		orisk.setPicId(pic_id);
		orisk.setTimes(times);
		desc.put("risk", orisk);
		return desc;

	}

	// 风险总览
	public OutRisk getRiskAll(Long reportId) {

		OutRisk outRisk = new OutRisk();
		List<OutItemRisk> risk = new ArrayList<OutItemRisk>();
		ReportMetaExample reportMetaExample = new ReportMetaExample();
		Criteria criteria = reportMetaExample.createCriteria();
		criteria.andReportIdEqualTo(reportId);
		List<ReportMeta> selectByExample = reportMetaMapper
				.selectByExample(reportMetaExample);
		List<Map<String, Object>> riskAll = reportMapper
				.getRoportItem(reportId);
		for (Map<String, Object> map : riskAll) {
			OutItemRisk outItemRisk = new OutItemRisk();

			String pic_id = map.get("pic_id").toString();
			String name = map.get("name").toString();
			Long id = Long.valueOf(map.get("item_id").toString());
			for (ReportMeta reportMeta : selectByExample) {
				String metaKey = reportMeta.getMetaKey();
				String s = "risk_level_of_item_named_" + name;
				if (metaKey.equals(s)) {
					String value = reportMeta.getMetaValue();
					if (value.contains("高")) {
						
						//String voice_id=reportMapper.getVoiceid(id).toString();
						Map<String, Object> voiceid = reportMapper.getVoiceid(id);
						
						String voice_id = voiceid.get("id").toString();
						outItemRisk.setVoice_id(voice_id);
					}
					outItemRisk.setLevel(value);
					
				}
			}
			outItemRisk.setPic_id(pic_id);
			outItemRisk.setName(name);
			risk.add(outItemRisk);
		}
		outRisk.setRisk(risk);
		return outRisk;
	}

	// 个性化建议
	public OutAlladvice getPersonalad(Long reportId) {
		// 查建议
		Set<OutAdvice> set = new HashSet<OutAdvice>();

		List<Map<String, Object>> itemRiskDetial = reportMapper
				.getItemRiskDetial(reportId);
		for (Map<String, Object> map : itemRiskDetial) {
			String meta_key = map.get("meta_key").toString();
			String item = meta_key.substring(meta_key.lastIndexOf("_") + 1,
					meta_key.length());
			List<OutAdvice> pa = reportMapper.getPA(item);
			if (pa != null && !pa.isEmpty()) {
				for (OutAdvice outAdvice : pa) {
					set.add(outAdvice);
				}
			}else {
				
				
				
				
				
				
				
				
			}
			
		}
		
		
		
		
		
		
		List<OutAdvice> suitPA = reportMapper.getSuitPA(reportId);
		for (OutAdvice outAdvice : suitPA) {
			set.add(outAdvice);
		}
		// 组装数据

		OutAlladvice personAdvice = new OutAlladvice();
		List<OutAdvices> arrayList = new ArrayList<OutAdvices>();
		// 对custom去重。
		Set<String> hashSet = new HashSet<String>();
		for (OutAdvice outAdvice : set) {
			String custom = outAdvice.getCustom();
			hashSet.add(custom);
		}
		// 根据每个custom创建一个对象。并把custom装进去并且放到集合中。
		for (String string : hashSet) {
			OutAdvices outAdvices = new OutAdvices();
			ArrayList<OAdvice> arrayList2 = new ArrayList<OAdvice>();
			outAdvices.setCustom(string);
			outAdvices.setAdvices(arrayList2);
			arrayList.add(outAdvices);
		}
		
		// 把查到的数据遍历，分别得到他的值。
		for (OutAdvice outAdvice : set) {
			String custom = outAdvice.getCustom();
			String advice = outAdvice.getAdvice();
			// 如果custom和创建的一致，则把值放进去。
			for (OutAdvices outAdvices : arrayList) {
				String custom2 = outAdvices.getCustom();
				if (custom.equals(custom2)) {
					OAdvice oAdvice = new OAdvice();
					oAdvice.setAdvice(advice);
					List<OAdvice> advice2 = outAdvices.getAdvices();
					advice2.add(oAdvice);
				}
			}
		
		}
		

		for (OutAdvices outAdvices : arrayList) {
			List<OAdvice> advices = outAdvices.getAdvices();
			if (advices.size()>1) {
				String s3="";
				String s1="建议定期去正规体检机构进行相关检查包括";
				String s="";
				String s2="等，从而进行疾病的早期检测，诊断和积极治疗。";
				for (int i = 0; i < advices.size(); i++) {
					String ad = "(" + (i+1) + ")" + advices.get(i).getAdvice();
					s=s+ad;
				}
				if (outAdvices.getCustom().equals("体检")) {
					String s4=s1+s+s2;
					s3=s4;
				}else {
					s3=s;
				}
				advices.removeAll(advices);
				OAdvice oAdvice = new OAdvice();
				oAdvice.setAdvice(s3);
				advices.add(oAdvice);
				outAdvices.setAdvices(advices);
			}
		}
		
		personAdvice.setOutadvices(arrayList);
		
		return personAdvice;
	}

}
