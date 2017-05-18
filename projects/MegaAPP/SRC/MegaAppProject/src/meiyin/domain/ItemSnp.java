package meiyin.domain;

public class ItemSnp {
    private Long id;

    private Long snpId;

    private Long itemId;

    private Long effectId;

    private Integer textId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSnpId() {
        return snpId;
    }

    public void setSnpId(Long snpId) {
        this.snpId = snpId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getEffectId() {
        return effectId;
    }

    public void setEffectId(Long effectId) {
        this.effectId = effectId;
    }

    public Integer getTextId() {
        return textId;
    }

    public void setTextId(Integer textId) {
        this.textId = textId;
    }
}