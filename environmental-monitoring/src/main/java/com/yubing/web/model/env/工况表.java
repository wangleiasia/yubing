package com.yubing.web.model.env;

public class 工况表 {
    private String 项目编号;

    private String 点位编号;

    private String 次序;

    private String 设计工况;

    private String 运行工况;

    private String 百分比;

    private String 单位;

    public String get项目编号() {
        return 项目编号;
    }

    public void set项目编号(String 项目编号) {
        this.项目编号 = 项目编号 == null ? null : 项目编号.trim();
    }

    public String get点位编号() {
        return 点位编号;
    }

    public void set点位编号(String 点位编号) {
        this.点位编号 = 点位编号 == null ? null : 点位编号.trim();
    }

    public String get次序() {
        return 次序;
    }

    public void set次序(String 次序) {
        this.次序 = 次序 == null ? null : 次序.trim();
    }

    public String get设计工况() {
        return 设计工况;
    }

    public void set设计工况(String 设计工况) {
        this.设计工况 = 设计工况 == null ? null : 设计工况.trim();
    }

    public String get运行工况() {
        return 运行工况;
    }

    public void set运行工况(String 运行工况) {
        this.运行工况 = 运行工况 == null ? null : 运行工况.trim();
    }

    public String get百分比() {
        return 百分比;
    }

    public void set百分比(String 百分比) {
        this.百分比 = 百分比 == null ? null : 百分比.trim();
    }

    public String get单位() {
        return 单位;
    }

    public void set单位(String 单位) {
        this.单位 = 单位 == null ? null : 单位.trim();
    }
}