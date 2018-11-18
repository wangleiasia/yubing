package com.yubing.web.model.sonar;

public class SonarEmployee {
    private String developer;

    private String password;

    private String superiorLeadership;

    private String importFlag;

    private Short state;

    private String superadministratorFlag;

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer == null ? null : developer.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSuperiorLeadership() {
        return superiorLeadership;
    }

    public void setSuperiorLeadership(String superiorLeadership) {
        this.superiorLeadership = superiorLeadership == null ? null : superiorLeadership.trim();
    }

    public String getImportFlag() {
        return importFlag;
    }

    public void setImportFlag(String importFlag) {
        this.importFlag = importFlag == null ? null : importFlag.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getSuperadministratorFlag() {
        return superadministratorFlag;
    }

    public void setSuperadministratorFlag(String superadministratorFlag) {
        this.superadministratorFlag = superadministratorFlag == null ? null : superadministratorFlag.trim();
    }
}