package com.yubing.web.model.env;

public class shouquanbiao {
    private Integer 序号;

    private String 账户;

    private String 姓名;

    private String 密码;

    private String 职责;

    private String 室别;

    private String 部门编号;

    public Integer get序号() {
        return 序号;
    }

    public void set序号(Integer 序号) {
        this.序号 = 序号;
    }

    public String get账户() {
        return 账户;
    }

    public void set账户(String 账户) {
        this.账户 = 账户 == null ? null : 账户.trim();
    }

    public String get姓名() {
        return 姓名;
    }

    public void set姓名(String 姓名) {
        this.姓名 = 姓名 == null ? null : 姓名.trim();
    }

    public String get密码() {
        return 密码;
    }

    public void set密码(String 密码) {
        this.密码 = 密码 == null ? null : 密码.trim();
    }

    public String get职责() {
        return 职责;
    }

    public void set职责(String 职责) {
        this.职责 = 职责 == null ? null : 职责.trim();
    }

    public String get室别() {
        return 室别;
    }

    public void set室别(String 室别) {
        this.室别 = 室别 == null ? null : 室别.trim();
    }

    public String get部门编号() {
        return 部门编号;
    }

    public void set部门编号(String 部门编号) {
        this.部门编号 = 部门编号 == null ? null : 部门编号.trim();
    }
}