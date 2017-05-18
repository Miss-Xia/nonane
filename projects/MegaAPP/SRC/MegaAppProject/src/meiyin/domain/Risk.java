package meiyin.domain;



public class Risk {
	private RiskLevel level;
	private String level_badge;
	private String desc;
	
	public RiskLevel getLevel() {
		return level;
	}
	public void setLevel(RiskLevel level) {
		this.level = level;
	}
	public String getLevel_badge() {
		return level_badge;
	}
	public void setLevel_badge(String level_badge) {
		this.level_badge = level_badge;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
