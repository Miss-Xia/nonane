package meiyin.domain;

import java.util.List;



public class Test {
	private String item_token;
	private Risk risk;
	private List<Snp> snp_results;
	private String snp_summary;
	public String getItem_token() {
		return item_token;
	}
	public void setItem_token(String item_token) {
		this.item_token = item_token;
	}
	public Risk getRisk() {
		return risk;
	}
	public void setRisk(Risk risk) {
		this.risk = risk;
	}
	public List<Snp> getSnp_results() {
		return snp_results;
	}
	public void setSnp_results(List<Snp> snp_results) {
		this.snp_results = snp_results;
	}
	public String getSnp_summary() {
		return snp_summary;
	}
	public void setSnp_summary(String snp_summary) {
		this.snp_summary = snp_summary;
	}
}
