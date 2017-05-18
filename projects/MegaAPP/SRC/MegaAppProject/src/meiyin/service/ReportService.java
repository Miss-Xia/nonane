package meiyin.service;

import java.util.List;
import java.util.Map;

import meiyin.domain.outdata.OutAlladvice;
import meiyin.domain.outdata.risk.OutRisk;

public interface ReportService {
	//报告列表
	public List<Map<String, Object>> getReport(Integer accountId);

	//报告详情
	public Map<String, Object> getExamDetial(long parseLong);
	
	//单项检测预防与建议
	public Map<String, Object> getRiskAndprec(String itemId ,String reportId);
	
	//风险纵览
	public OutRisk  getRiskAll(Long reportId);
	
	//个性化建议
	public OutAlladvice getPersonalad(Long reportId);
}
