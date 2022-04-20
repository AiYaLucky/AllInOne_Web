package com.allinone.entity;

/**
 * Url站点对象类
 *
 * @Author: xu xiao wei
 * @Date: 2022/4/19 22:36
 * @Version 1.0
 * Created by IntelliJ IDEA.
 */

public class Url {
    private String id;
    private String name;
    private String url;
    private String desc;
    private String rule;
    private boolean active;

    public Url(String url, String name, boolean active) {
        this.url = url;
        this.name = name;
        this.active = active;
    }

    public Url() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
