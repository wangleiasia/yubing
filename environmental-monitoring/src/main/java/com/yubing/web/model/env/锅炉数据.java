package com.yubing.web.model.env;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class 锅炉数据 {
    private String 项目编号;

    private Integer 序号;

    private String 点位编号;

    private String 样品编号;

    private String 时间段;

    private String 项目名称;

    private String 检测结果;

    private String 方法代码;

    private String 单位;


    private Date 检测日期;

    private String 时间;

    private String 检测人;

    private String 仪器编号;

    private String 复核;

    private String 结论;

    private String 选择;

    private String s检测日期;

    public String getS检测日期() {
        return s检测日期;
    }

    public void setS检测日期(String s检测日期) {
        this.s检测日期 = s检测日期;
    }

    public String get项目编号() {
        return 项目编号;
    }

    public void set项目编号(String 项目编号) {
        this.项目编号 = 项目编号 == null ? null : 项目编号.trim();
    }

    public Integer get序号() {
        return 序号;
    }

    public void set序号(Integer 序号) {
        this.序号 = 序号;
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

    public String get时间段() {
        return 时间段;
    }

    public void set时间段(String 时间段) {
        this.时间段 = 时间段 == null ? null : 时间段.trim();
    }

    public String get项目名称() {
        return 项目名称;
    }

    public void set项目名称(String 项目名称) {
        this.项目名称 = 项目名称 == null ? null : 项目名称.trim();
    }

    public String get检测结果() {
        return 检测结果;
    }

    public void set检测结果(String 检测结果) {
        this.检测结果 = 检测结果 == null ? null : 检测结果.trim();
    }

    public String get方法代码() {
        return 方法代码;
    }

    public void set方法代码(String 方法代码) {
        this.方法代码 = 方法代码 == null ? null : 方法代码.trim();
    }

    public String get单位() {
        return 单位;
    }

    public void set单位(String 单位) {
        this.单位 = 单位 == null ? null : 单位.trim();
    }

    public Date get检测日期() {
        return 检测日期;
    }

    public void set检测日期(Date 检测日期) {
        this.检测日期 = 检测日期;
    }

    public String get时间() {
        return 时间;
    }

    public void set时间(String 时间) {
        this.时间 = 时间 == null ? null : 时间.trim();
    }

    public String get检测人() {
        return 检测人;
    }

    public void set检测人(String 检测人) {
        this.检测人 = 检测人 == null ? null : 检测人.trim();
    }

    public String get仪器编号() {
        return 仪器编号;
    }

    public void set仪器编号(String 仪器编号) {
        this.仪器编号 = 仪器编号 == null ? null : 仪器编号.trim();
    }

    public String get复核() {
        return 复核;
    }

    public void set复核(String 复核) {
        this.复核 = 复核 == null ? null : 复核.trim();
    }

    public String get结论() {
        return 结论;
    }

    public void set结论(String 结论) {
        this.结论 = 结论 == null ? null : 结论.trim();
    }

    public String get选择() {
        return 选择;
    }

    public void set选择(String 选择) {
        this.选择 = 选择 == null ? null : 选择.trim();
    }
}