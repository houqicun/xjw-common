package com.hou.xjw.utils;

import org.apache.log4j.Logger;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 * create by houqicun 2017/11/9
 *
 * version 1.0 (maybe just test)
 *
 * util for send httpRequest. (get or post)
 *
 * */

public class HttpClientUtil {

    protected static Logger logger = Logger.getLogger(HttpClientUtil.class);

    public static String get(String url) {
        logger.info("run HttpClientUtil.get; url is " + url);
        return post(url, null);
    }

    /**
     * 使用post方法请求，若参数为null，则实际上使用get请求
     *
     * */
    public static String post(String url, Map<String, String> map) {
        logger.info("run HttpClientUtil.post; url is " + url + " ; map is " + map);
        HttpURLConnection conn = null;
        try {
            URL u = new URL(url);
            conn = (HttpURLConnection) u.openConnection();
            StringBuffer sb = null;
            //如果请求参数不为null
            if (map != null) {
                sb = new StringBuffer();
                //默认为false，post方法需要写入参数
                conn.setDoOutput(true);
                //默认为get，这里设定为post
                conn.setRequestMethod("POST");
                OutputStream out = conn.getOutputStream();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
                //将参数封装成键值对
                for (Map.Entry e : map.entrySet()) {
                    sb.append(e.getKey()).append("=").append(e.getValue()).append("&");
                }
                //将参数通过输出流写入
                bw.write(sb.deleteCharAt(sb.toString().length() - 1).toString());
                //关闭并释放资源
                bw.close();
                sb = null;
            }
            //建立连接
            conn.connect();
            sb = new StringBuffer();
            //获取连接的状态码
            int recode = conn.getResponseCode();
            logger.info("conn recode is " + recode);
            BufferedReader br = null;
            if (recode == 200) {
                //获取输入流
                InputStream in = conn.getInputStream();
                //封装输入流
                br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
                String str = "";
                sb = new StringBuffer();
                while ((str = br.readLine()) != null) {
                    sb.append(str).append(System.getProperty("line.separator"));
                }
                //关闭
                br.close();
                if (sb.toString().length() == 0) {
                    return null;
                }
                String outStr = sb.toString().substring(0, sb.toString().length() - System.getProperty("line.separator").length());
                logger.info("conn outStr is " + outStr);
                return outStr;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
        return null;
    }
}
