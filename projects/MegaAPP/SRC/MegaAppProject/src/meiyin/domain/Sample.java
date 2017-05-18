package meiyin.domain;

import java.util.Date;

public class Sample {
    private Long id;

    private Long typeId;

    private Long userId;

    private String serial;

    private Date samplingTime;

    private Date receptionTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial == null ? null : serial.trim();
    }

    public Date getSamplingTime() {
        return samplingTime;
    }

    public void setSamplingTime(Date samplingTime) {
        this.samplingTime = samplingTime;
    }

    public Date getReceptionTime() {
        return receptionTime;
    }

    public void setReceptionTime(Date receptionTime) {
        this.receptionTime = receptionTime;
    }
}