package meiyin.domain;

public class Effect {
    private Long effectId;

    private String effect;

    public Long getEffectId() {
        return effectId;
    }

    public void setEffectId(Long effectId) {
        this.effectId = effectId;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect == null ? null : effect.trim();
    }
}