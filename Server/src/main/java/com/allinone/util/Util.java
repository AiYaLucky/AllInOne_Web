package com.allinone.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.allinone.entity.Url;
import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * 工具类
 *
 * @Author: xu xiao wei
 * @Date: 2022/4/19 22:34
 * @Version 1.0
 * Created by IntelliJ IDEA.
 */
public class Util {
    public static HashMap<String, Url> webSiteDb = new HashMap<>();

    /**
     * 获取站点url的配置
     *
     * @return 返回一个map key是站点id value是站点具体数据
     */
    public static HashMap<String, Url> getUrlData() throws IOException {
        if (webSiteDb.size() == 0) {
            JSONArray jsonArray = getUrlConfig();
            for (Object urlDb : jsonArray) {
                Url url = JSON.parseObject(urlDb.toString(), Url.class);
                webSiteDb.put(url.getId(), url);
            }
        }
        return webSiteDb;
    }

    public static JSONArray getUrlConfig() throws IOException {
        ClassPathResource resource = new ClassPathResource("config/url.json");
        File file = resource.getFile();
        String dbStr = FileUtils.readFileToString(file, "utf-8");
        JSONArray jsonArray = JSON.parseArray(dbStr);
        return jsonArray;
    }
//
//    /**
//     * 懒汉单例模式
//     * @return 返回一个HashMap<String, Url>单例的全局静态变量
//     */
//    public static HashMap<String, Url> getInstance() {
//        if (webSiteDb == null) {
//            webSiteDb = new HashMap<>(16);
//        }
//        return webSiteDb;
//    }
}
