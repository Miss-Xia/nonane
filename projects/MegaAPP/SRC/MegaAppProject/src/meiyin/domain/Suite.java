package meiyin.domain;

import java.util.Date;

public class Suite {
    private Long suiteId;

    private String cname;

    private String ename;

    private Long coverPicId;

    private Integer textId;

    private Date updatedTime;

    public Long getSuiteId() {
        return suiteId;
    }

    public void setSuiteId(Long suiteId) {
        this.suiteId = suiteId;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public Long getCoverPicId() {
        return coverPicId;
    }

    public void setCoverPicId(Long coverPicId) {
        this.coverPicId = coverPicId;
    }

    public Integer getTextId() {
        return textId;
    }

    public void setTextId(Integer textId) {
        this.textId = textId;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}