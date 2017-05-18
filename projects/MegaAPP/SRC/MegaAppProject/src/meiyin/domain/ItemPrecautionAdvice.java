package meiyin.domain;

public class ItemPrecautionAdvice {
    private Long id;

    private Long riskLevelId;

    private Long adviceId;

    private Long itemId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRiskLevelId() {
        return riskLevelId;
    }

    public void setRiskLevelId(Long riskLevelId) {
        this.riskLevelId = riskLevelId;
    }

    public Long getAdviceId() {
        return adviceId;
    }

    public void setAdviceId(Long adviceId) {
        this.adviceId = adviceId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
}