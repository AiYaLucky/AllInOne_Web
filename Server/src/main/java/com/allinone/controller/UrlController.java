package com.allinone.controller;

import com.alibaba.fastjson.JSON;
import com.allinone.entity.Url;
import com.allinone.util.Util;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;

/**
 * @Author: xu xiao wei
 * @Date: 2022/4/13 15:28
 * @Version 1.0
 * Created by IntelliJ IDEA.
 */
@RestController
@CrossOrigin
@RequestMapping("/url")
public class UrlController {
    /**
     * 网站配置数据
     */
    HashMap<String, Url> webSiteDb;

    /**
     * 构造函数
     */
    public UrlController() throws IOException {
        this.webSiteDb = Util.getUrlData();
    }


    /**
     * 获取链接
     */
    @RequestMapping("/geturl/{id}")
    public String getPic(@PathVariable("id") String id) {
        //读取配置
        Url url = new Url();
        if (webSiteDb.containsKey(id)) {
            url = webSiteDb.get(id);
        }
        return JSON.toJSONString(url);
    }
}
