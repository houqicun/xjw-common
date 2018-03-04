package com.hou.xjw.utils;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;

import java.util.List;

/**
 *
 * The JsonUtil is used by fastjson;
 *
 * 可转成泛型对象，或是泛型对象的list集合
 *
 * 2017/11/22 ：待优化，目前也可以不用此类，自行使用JSONObject进行解析
 *
 * */

public class JsonUtil {

    protected static Logger logger = Logger.getLogger(HttpClientUtil.class);

    public static <T> T getObject(String jsonStr, Class<T> cls) {
        T t = null;
        try {
            t = JSON.parseObject(jsonStr, cls);
        } catch (Exception e) {
            logger.error("json parse object is fail! jsonStr : " + jsonStr + " ; cls : " + cls);
            throw new RuntimeException(e);
        }
        return t;
    }

    public static <T> List<T> getObjectList(String jsonStr, Class<T> cls) {
        List<T> list = null;
        try {
            list = JSON.parseArray(jsonStr, cls);
        } catch (Exception e) {
            logger.error("json parse objectList is fail! jsonStr : " + jsonStr + " ; cls : " + cls);
            throw new RuntimeException(e);
        }
        return list;
    }

}
