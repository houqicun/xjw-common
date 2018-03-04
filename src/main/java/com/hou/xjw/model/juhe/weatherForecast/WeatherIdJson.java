package com.hou.xjw.model.juhe.weatherForecast;

/**
 *
 * 为聚合数据返回的JSON做处理用的model ：天气标识处理
 *
 * fa 天气标识1
 * fo 天气标识2
 * 如果fa不等于fb，说明是组合天气
 *
 * */

public class WeatherIdJson {

    private String fa;
    private String fo;

    public String getFa() {
        return fa;
    }

    public void setFa(String fa) {
        this.fa = fa;
    }

    public String getFo() {
        return fo;
    }

    public void setFo(String fo) {
        this.fo = fo;
    }
}
