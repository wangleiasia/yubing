package com.yubing.web.model.env;

import java.util.Date;

public class 设备台账 {
    private Integer 序号;

    private String 设备名称;

    private String 型号;

    private String 设备编号;

    private String 产品编号;

    private String 购入日期;

    private String 生产厂家;

    private Date 校准日期;

    private Date 校准有效期至;

    private String 溯源方式;

    private String 校准单位;

    private String 责任人;

    private String 类别;

    private String 监测类别;

    public Integer get序号() {
        return 序号;
    }

    public void set序号(Integer 序号) {
        this.序号 = 序号;
    }

    public String get设备名称() {
        return 设备名称;
    }

    public void set设备名称(String 设备名称) {
        this.设备名称 = 设备名称 == null ? null : 设备名称.trim();
    }

    public String get型号() {
        return 型号;
    }

    public void set型号(String 型号) {
        this.型号 = 型号 == null ? null : 型号.trim();
    }

    public String get设备编号() {
        return 设备编号;
    }

    public void set设备编号(String 设备编号) {
        this.设备编号 = 设备编号 == null ? null : 设备编号.trim();
    }

    public String get产品编号() {
        return 产品编号;
    }

    public void set产品编号(String 产品编号) {
        this.产品编号 = 产品编号 == null ? null : 产品编号.trim();
    }

    public String get购入日期() {
        return 购入日期;
    }

    public void set购入日期(String 购入日期) {
        this.购入日期 = 购入日期 == null ? null : 购入日期.trim();
    }

    public String get生产厂家() {
        return 生产厂家;
    }

    public void set生产厂家(String 生产厂家) {
        this.生产厂家 = 生产厂家 == null ? null : 生产厂家.trim();
    }

    public Date get校准日期() {
        return 校准日期;
    }

    public void set校准日期(Date 校准日期) {
        this.校准日期 = 校准日期;
    }

    public Date get校准有效期至() {
        return 校准有效期至;
    }

    public void set校准有效期至(Date 校准有效期至) {
        this.校准有效期至 = 校准有效期至;
    }

    public String get溯源方式() {
        return 溯源方式;
    }

    public void set溯源方式(String 溯源方式) {
        this.溯源方式 = 溯源方式 == null ? null : 溯源方式.trim();
    }

    public String get校准单位() {
        return 校准单位;
    }

    public void set校准单位(String 校准单位) {
        this.校准单位 = 校准单位 == null ? null : 校准单位.trim();
    }

    public String get责任人() {
        return 责任人;
    }

    public void set责任人(String 责任人) {
        this.责任人 = 责任人 == null ? null : 责任人.trim();
    }

    public String get类别() {
        return 类别;
    }

    public void set类别(String 类别) {
        this.类别 = 类别 == null ? null : 类别.trim();
    }

    public String get监测类别() {
        return 监测类别;
    }

    public void set监测类别(String 监测类别) {
        this.监测类别 = 监测类别 == null ? null : 监测类别.trim();
    }
}