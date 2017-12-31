package com.yubing.web.model.env;

import java.util.Date;

public class 大气样品 {
    private String 项目编号;

    private String 点位编号;

    private String 样品编号;

    private String 分类;

    private String 样品类别;

    private String 检测类别;

    private Date 检测日期;

    private String 时间段;

    private String 勾选;

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

    public String get样品编号() {
        return 样品编号;
    }

    public void set样品编号(String 样品编号) {
        this.样品编号 = 样品编号 == null ? null : 样品编号.trim();
    }

    public String get分类() {
        return 分类;
    }

    public void set分类(String 分类) {
        this.分类 = 分类 == null ? null : 分类.trim();
    }

    public String get样品类别() {
        return 样品类别;
    }

    public void set样品类别(String 样品类别) {
        this.样品类别 = 样品类别 == null ? null : 样品类别.trim();
    }

    public String get检测类别() {
        return 检测类别;
    }

    public void set检测类别(String 检测类别) {
        this.检测类别 = 检测类别 == null ? null : 检测类别.trim();
    }

    public Date get检测日期() {
        return 检测日期;
    }

    public void set检测日期(Date 检测日期) {
        this.检测日期 = 检测日期;
    }

    public String get时间段() {
        return 时间段;
    }

    public void set时间段(String 时间段) {
        this.时间段 = 时间段 == null ? null : 时间段.trim();
    }

    public String get勾选() {
        return 勾选;
    }

    public void set勾选(String 勾选) {
        this.勾选 = 勾选 == null ? null : 勾选.trim();
    }
}