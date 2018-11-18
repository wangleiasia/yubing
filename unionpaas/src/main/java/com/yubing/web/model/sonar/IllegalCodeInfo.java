package com.yubing.web.model.sonar;

import java.util.Date;

public class IllegalCodeInfo {
    private Integer illegalId;

    private String codeTime;

    private String developer;

    private String project;

    private String modular;

    private String codeUrl;

    private Integer codeLine;

    private String illegalLevel;

    private String ruleName;

    private String illegalDescription;

    private String revisingSuggestions1;

    private String revisingSuggestions2;

    private String revisingSuggestions3;

    private String illegalLabel;

    private Date createTime;

    private Integer batchNumber;

    private Short state;

    private String bugSerial;

    private String modifyDeveloper;

    private Date modifyTime;

    private String remark;

    private String modifyState;

    public Integer getIllegalId() {
        return illegalId;
    }

    public void setIllegalId(Integer illegalId) {
        this.illegalId = illegalId;
    }

    public String getCodeTime() {
        return codeTime;
    }

    public void setCodeTime(String codeTime) {
        this.codeTime = codeTime == null ? null : codeTime.trim();
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer == null ? null : developer.trim();
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public String getModular() {
        return modular;
    }

    public void setModular(String modular) {
        this.modular = modular == null ? null : modular.trim();
    }

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl == null ? null : codeUrl.trim();
    }

    public Integer getCodeLine() {
        return codeLine;
    }

    public void setCodeLine(Integer codeLine) {
        this.codeLine = codeLine;
    }

    public String getIllegalLevel() {
        return illegalLevel;
    }

    public void setIllegalLevel(String illegalLevel) {
        this.illegalLevel = illegalLevel == null ? null : illegalLevel.trim();
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    public String getIllegalDescription() {
        return illegalDescription;
    }

    public void setIllegalDescription(String illegalDescription) {
        this.illegalDescription = illegalDescription == null ? null : illegalDescription.trim();
    }

    public String getRevisingSuggestions1() {
        return revisingSuggestions1;
    }

    public void setRevisingSuggestions1(String revisingSuggestions1) {
        this.revisingSuggestions1 = revisingSuggestions1 == null ? null : revisingSuggestions1.trim();
    }

    public String getRevisingSuggestions2() {
        return revisingSuggestions2;
    }

    public void setRevisingSuggestions2(String revisingSuggestions2) {
        this.revisingSuggestions2 = revisingSuggestions2 == null ? null : revisingSuggestions2.trim();
    }

    public String getRevisingSuggestions3() {
        return revisingSuggestions3;
    }

    public void setRevisingSuggestions3(String revisingSuggestions3) {
        this.revisingSuggestions3 = revisingSuggestions3 == null ? null : revisingSuggestions3.trim();
    }

    public String getIllegalLabel() {
        return illegalLabel;
    }

    public void setIllegalLabel(String illegalLabel) {
        this.illegalLabel = illegalLabel == null ? null : illegalLabel.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getBugSerial() {
        return bugSerial;
    }

    public void setBugSerial(String bugSerial) {
        this.bugSerial = bugSerial == null ? null : bugSerial.trim();
    }

    public String getModifyDeveloper() {
        return modifyDeveloper;
    }

    public void setModifyDeveloper(String modifyDeveloper) {
        this.modifyDeveloper = modifyDeveloper == null ? null : modifyDeveloper.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getModifyState() {
        return modifyState;
    }

    public void setModifyState(String modifyState) {
        this.modifyState = modifyState == null ? null : modifyState.trim();
    }
}