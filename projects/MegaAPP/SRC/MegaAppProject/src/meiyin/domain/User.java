package meiyin.domain;

import java.util.Date;

public class User {
    private Long id;

    private Long portraitId;

    private String name;

    private String gender;

    private Date birthday;

    private String idCardNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPortraitId() {
        return portraitId;
    }

    public void setPortraitId(Long portraitId) {
        this.portraitId = portraitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum == null ? null : idCardNum.trim();
    }
}