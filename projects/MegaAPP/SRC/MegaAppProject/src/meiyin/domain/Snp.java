package meiyin.domain;

public class Snp {
    private Long id;

    private String geneSerial;

    private String genePoint;

    private String geneCode;

    private Float frequency;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGeneSerial() {
        return geneSerial;
    }

    public void setGeneSerial(String geneSerial) {
        this.geneSerial = geneSerial == null ? null : geneSerial.trim();
    }

    public String getGenePoint() {
        return genePoint;
    }

    public void setGenePoint(String genePoint) {
        this.genePoint = genePoint == null ? null : genePoint.trim();
    }

    public String getGeneCode() {
        return geneCode;
    }

    public void setGeneCode(String geneCode) {
        this.geneCode = geneCode == null ? null : geneCode.trim();
    }

    public Float getFrequency() {
        return frequency;
    }

    public void setFrequency(Float frequency) {
        this.frequency = frequency;
    }
}