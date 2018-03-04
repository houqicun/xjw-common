package com.hou.xjw.model.juhe.weatherForecast;


/**
 *
 * 为聚合数据返回的JSON做处理用的model ：结果层处理
 *
 * sk 当前实况天气
 * today 今天天气
 * future 未来天气
 *
 * */

public class ResultJson {

    private String sk;
    private String today;
    private String future;

    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public String getFuture() {
        return future;
    }

    public void setFuture(String future) {
        this.future = future;
    }

    @Override
    public String toString() {
        return "ResultJson{" +
                "sk='" + sk + '\'' +
                ", today='" + today + '\'' +
                ", future='" + future + '\'' +
                '}';
    }
}
