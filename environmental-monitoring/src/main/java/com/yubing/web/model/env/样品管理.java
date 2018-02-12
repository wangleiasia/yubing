package com.yubing.web.model.env;

import java.util.Date;

public class 样品管理 {
    private String 项目编号;

    private String 点位编号;

    private String 样品编号;

    private String 分类;

    private String 样品类别;

    private String 检测类别;

    private Date 采样日期;

    private String 时间段;

    private String 样品管理;

    private String 收样日期;

    private String 发样人;

    private Date 发样日期;

    private String 审核人;

    private String 勾选;

    private Date 采样时间;

    private String 采样流量;

    private String 备注;

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

    public Date get采样日期() {
        return 采样日期;
    }

    public void set采样日期(Date 采样日期) {
        this.采样日期 = 采样日期;
    }

    public String get时间段() {
        return 时间段;
    }

    public void set时间段(String 时间段) {
        this.时间段 = 时间段 == null ? null : 时间段.trim();
    }

    public String get样品管理() {
        return 样品管理;
    }

    public void set样品管理(String 样品管理) {
        this.样品管理 = 样品管理 == null ? null : 样品管理.trim();
    }

    public String get收样日期() {
        return 收样日期;
    }

    public void set收样日期(String 收样日期) {
        this.收样日期 = 收样日期 == null ? null : 收样日期.trim();
    }

    public String get发样人() {
        return 发样人;
    }

    public void set发样人(String 发样人) {
        this.发样人 = 发样人 == null ? null : 发样人.trim();
    }

    public Date get发样日期() {
        return 发样日期;
    }

    public void set发样日期(Date 发样日期) {
        this.发样日期 = 发样日期;
    }

    public String get审核人() {
        return 审核人;
    }

    public void set审核人(String 审核人) {
        this.审核人 = 审核人 == null ? null : 审核人.trim();
    }

    public String get勾选() {
        return 勾选;
    }

    public void set勾选(String 勾选) {
        this.勾选 = 勾选 == null ? null : 勾选.trim();
    }

    public Date get采样时间() {
        return 采样时间;
    }

    public void set采样时间(Date 采样时间) {
        this.采样时间 = 采样时间;
    }

    public String get采样流量() {
        return 采样流量;
    }

    public void set采样流量(String 采样流量) {
        this.采样流量 = 采样流量 == null ? null : 采样流量.trim();
    }

    public String get备注() {
        return 备注;
    }

    public void set备注(String 备注) {
        this.备注 = 备注 == null ? null : 备注.trim();
    }
}