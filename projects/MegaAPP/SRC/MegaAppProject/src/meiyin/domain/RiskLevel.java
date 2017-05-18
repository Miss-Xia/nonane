package meiyin.domain;

public class RiskLevel {
    private Long riskLevelId;

    private Long picId;

    private String level;

    public Long getRiskLevelId() {
        return riskLevelId;
    }

    public void setRiskLevelId(Long riskLevelId) {
        this.riskLevelId = riskLevelId;
    }

    public Long getPicId() {
        return picId;
    }

    public void setPicId(Long picId) {
        this.picId = picId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }
}