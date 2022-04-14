package com.allinone.controller;

/**
 * @Author: xu xiao wei
 * @Date: 2022/4/14 00:04
 * @Version 1.0
 * Created by IntelliJ IDEA.
 */
public class BaseUrlVo {
    private String urlName;
    private String url;
    private boolean active;


    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return this.urlName + " : " + this.url + " : " + this.active;
    }
}
