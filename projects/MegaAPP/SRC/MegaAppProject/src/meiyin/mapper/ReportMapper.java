package meiyin.mapper;

import java.util.List;
import java.util.Map;

import meiyin.domain.LongText;
import meiyin.domain.Report;
import meiyin.domain.ReportExample;
import meiyin.domain.outdata.InSNP;
import meiyin.domain.outdata.OutAdvice;
import meiyin.domain.outdata.risk.InRisk;
import meiyin.domain.outdata.risk.Inlevel;
import meiyin.domain.outdata.risk.OutAdviceEx;

import org.apache.ibatis.annotations.Param;

public interface ReportMapper {
    int countByExample(ReportExample example);

    int deleteByExample(ReportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Report record);

    int insertSelective(Report record);

    List<Report> selectByExample(ReportExample example);

    Report selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByExample(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByPrimaryKeySelective(Report record);

    int updateByPrimaryKey(Report record);

    
    //自定义的查询语句
    
    
    //得到检测报告列表
    List<Map<String, Object>> getExamList(Integer accountId);
    
    Map<String, Object> getReport(long reportId);
    List<Map<String, Object>> getItemList(Long suite_id);
    Map<String, Object> getItemDesc(Long item_id);
    List<Map<String, Object>> getSNP(InSNP inSNP);
    LongText getResult(Integer text_id);
    List<Map<String, Object>> getItemAdvice(Long item_id);
    List<Map<String, Object>> getRoportItem(Long reportId);
    Map<String, Object> getRisk(Long itemId);
    List<Map<String, Object>> getPersonalad(Map<String, Object> map);
    List<OutAdvice> getPA(String item);
    List<OutAdvice> getSuitPA(Long reportId);
    Map<String, Object> getItemName(Long item_id);
    Map<String, Object>  getItemRisk(InRisk inRisk);
    Map<String, Object> getRiskLevel(String risk);
    List<Map<String, Object>> getItemRiskDetial(Long reportId);
    
    Map<String, Object> getVoiceid(Long id);
    Map<String, Object> getVoice(Long id);
    
}