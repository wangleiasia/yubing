package com.yubing.web.model.env;

public class 锅炉模板 {
    private Integer 序号;

    private String 项目名称;

    private String 类别;

    private String 方法代码;

    private String 对应项目;

    private String 单位;

    private String 保留位;

    private String 检测人;

    private String 仪器编号;

    public Integer get序号() {
        return 序号;
    }

    public void set序号(Integer 序号) {
        this.序号 = 序号;
    }

    public String get项目名称() {
        return 项目名称;
    }

    public void set项目名称(String 项目名称) {
        this.项目名称 = 项目名称 == null ? null : 项目名称.trim();
    }

    public String get类别() {
        return 类别;
    }

    public void set类别(String 类别) {
        this.类别 = 类别 == null ? null : 类别.trim();
    }

    public String get方法代码() {
        return 方法代码;
    }

    public void set方法代码(String 方法代码) {
        this.方法代码 = 方法代码 == null ? null : 方法代码.trim();
    }

    public String get对应项目() {
        return 对应项目;
    }

    public void set对应项目(String 对应项目) {
        this.对应项目 = 对应项目 == null ? null : 对应项目.trim();
    }

    public String get单位() {
        return 单位;
    }

    public void set单位(String 单位) {
        this.单位 = 单位 == null ? null : 单位.trim();
    }

    public String get保留位() {
        return 保留位;
    }

    public void set保留位(String 保留位) {
        this.保留位 = 保留位 == null ? null : 保留位.trim();
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
}