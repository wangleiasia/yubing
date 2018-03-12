package com.yubing.web.model.sonar;

import java.util.Date;

public class DeveloperIllegalInfo {
    private String developer;

    private Integer blocker;

    private Integer critical;

    private Integer major;

    private Integer minor;

    private Integer info;

    private Date createDate;

    private Integer batchNumber;

    private Short state;

    private Integer hasModify;

    private Integer surplus;

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer == null ? null : developer.trim();
    }

    public Integer getBlocker() {
        return blocker;
    }

    public void setBlocker(Integer blocker) {
        this.blocker = blocker;
    }

    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public Integer getMinor() {
        return minor;
    }

    public void setMinor(Integer minor) {
        this.minor = minor;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(Integer batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Integer getHasModify() {
        return hasModify;
    }

    public void setHasModify(Integer hasModify) {
        this.hasModify = hasModify;
    }

    public Integer getSurplus() {
        return surplus;
    }

    public void setSurplus(Integer surplus) {
        this.surplus = surplus;
    }
}