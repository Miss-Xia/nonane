package meiyin.domain;

import java.util.List;



public class Examine {
	private Sample sample;
	private Integer report_data;
	private List<Test> tests;
	private List<Advice> advices;
	private String consignor;
	private String consignor_badge;
	private ExamineStatus status;
	private Subject subject;
	private String suite_token;
	private String token;
	public Sample getSample() {
		return sample;
	}
	public void setSample(Sample sample) {
		this.sample = sample;
	}
	public Integer getReport_data() {
		return report_data;
	}
	public void setReport_data(Integer report_data) {
		this.report_data = report_data;
	}
	public List<Test> getTests() {
		return tests;
	}
	public void setTests(List<Test> tests) {
		this.tests = tests;
	}
	public List<Advice> getAdvices() {
		return advices;
	}
	public void setAdvices(List<Advice> advices) {
		this.advices = advices;
	}
	public String getConsignor() {
		return consignor;
	}
	public void setConsignor(String consignor) {
		this.consignor = consignor;
	}
	public String getConsignor_badge() {
		return consignor_badge;
	}
	public void setConsignor_badge(String consignor_badge) {
		this.consignor_badge = consignor_badge;
	}
	public ExamineStatus getStatus() {
		return status;
	}
	public void setStatus(ExamineStatus status) {
		this.status = status;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public String getSuite_token() {
		return suite_token;
	}
	public void setSuite_token(String suite_token) {
		this.suite_token = suite_token;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
}
