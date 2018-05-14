package com.yubing.web.model.env;

import java.util.Date;

public class 现场噪声监测记录 {
    private String 项目编号;

    private String 样品编号;

    private String 方法代码;

    private String 设备编号;

    private String 点位编号;

    private String 月;

    private String 日;

    private String 时;

    private String 分;

    private String leq;

    private String l10;

    private String l50;

    private String l90;

    private String lmax;

    private String lmin;

    private String 标准差sd;

    private String 时间段;

    private String 大型车;

    private String 中小型车;

    private String 检测人员;

    private Date 检测日期;

    private String 复核;

    private String 小型车;

    private String 气象条件;

    public String get项目编号() {
        return 项目编号;
    }

    public void set项目编号(String 项目编号) {
        this.项目编号 = 项目编号 == null ? null : 项目编号.trim();
    }

    public String get样品编号() {
        return 样品编号;
    }

    public void set样品编号(String 样品编号) {
        this.样品编号 = 样品编号 == null ? null : 样品编号.trim();
    }

    public String get方法代码() {
        return 方法代码;
    }

    public void set方法代码(String 方法代码) {
        this.方法代码 = 方法代码 == null ? null : 方法代码.trim();
    }

    public String get设备编号() {
        return 设备编号;
    }

    public void set设备编号(String 设备编号) {
        this.设备编号 = 设备编号 == null ? null : 设备编号.trim();
    }

    public String get点位编号() {
        return 点位编号;
    }

    public void set点位编号(String 点位编号) {
        this.点位编号 = 点位编号 == null ? null : 点位编号.trim();
    }

    public String get月() {
        return 月;
    }

    public void set月(String 月) {
        this.月 = 月 == null ? null : 月.trim();
    }

    public String get日() {
        return 日;
    }

    public void set日(String 日) {
        this.日 = 日 == null ? null : 日.trim();
    }

    public String get时() {
        return 时;
    }

    public void set时(String 时) {
        this.时 = 时 == null ? null : 时.trim();
    }

    public String get分() {
        return 分;
    }

    public void set分(String 分) {
        this.分 = 分 == null ? null : 分.trim();
    }

    public String getLeq() {
        return leq;
    }

    public void setLeq(String leq) {
        this.leq = leq == null ? null : leq.trim();
    }

    public String getL10() {
        return l10;
    }

    public void setL10(String l10) {
        this.l10 = l10 == null ? null : l10.trim();
    }

    public String getL50() {
        return l50;
    }

    public void setL50(String l50) {
        this.l50 = l50 == null ? null : l50.trim();
    }

    public String getL90() {
        return l90;
    }

    public void setL90(String l90) {
        this.l90 = l90 == null ? null : l90.trim();
    }

    public String getLmax() {
        return lmax;
    }

    public void setLmax(String lmax) {
        this.lmax = lmax == null ? null : lmax.trim();
    }

    public String getLmin() {
        return lmin;
    }

    public void setLmin(String lmin) {
        this.lmin = lmin == null ? null : lmin.trim();
    }

    public String get标准差sd() {
        return 标准差sd;
    }

    public void set标准差sd(String 标准差sd) {
        this.标准差sd = 标准差sd == null ? null : 标准差sd.trim();
    }

    public String get时间段() {
        return 时间段;
    }

    public void set时间段(String 时间段) {
        this.时间段 = 时间段 == null ? null : 时间段.trim();
    }

    public String get大型车() {
        return 大型车;
    }

    public void set大型车(String 大型车) {
        this.大型车 = 大型车 == null ? null : 大型车.trim();
    }

    public String get中小型车() {
        return 中小型车;
    }

    public void set中小型车(String 中小型车) {
        this.中小型车 = 中小型车 == null ? null : 中小型车.trim();
    }

    public String get检测人员() {
        return 检测人员;
    }

    public void set检测人员(String 检测人员) {
        this.检测人员 = 检测人员 == null ? null : 检测人员.trim();
    }

    public Date get检测日期() {
        return 检测日期;
    }

    public void set检测日期(Date 检测日期) {
        this.检测日期 = 检测日期;
    }

    public String get复核() {
        return 复核;
    }

    public void set复核(String 复核) {
        this.复核 = 复核 == null ? null : 复核.trim();
    }

    public String get小型车() {
        return 小型车;
    }

    public void set小型车(String 小型车) {
        this.小型车 = 小型车 == null ? null : 小型车.trim();
    }

    public String get气象条件() {
        return 气象条件;
    }

    public void set气象条件(String 气象条件) {
        this.气象条件 = 气象条件 == null ? null : 气象条件.trim();
    }
}