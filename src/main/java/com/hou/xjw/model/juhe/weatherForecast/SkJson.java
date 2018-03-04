package com.hou.xjw.model.juhe.weatherForecast;

/**
 *
 * 为聚合数据返回的JSON做处理用的model ：当前实况天气处理
 *
 * temp 当前温度
 * wind_direction 当前风向
 * wind_strength 当前风力
 * humidity 当前湿度
 * time 更新时间
 *
 * */

public class SkJson {

    private String temp;
    private String wind_direction;
    private String wind_strength;
    private String humidity;
    private String time;

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public String getWind_strength() {
        return wind_strength;
    }

    public void setWind_strength(String wind_strength) {
        this.wind_strength = wind_strength;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "SkJson{" +
                "temp='" + temp + '\'' +
                ", wind_direction='" + wind_direction + '\'' +
                ", wind_strength='" + wind_strength + '\'' +
                ", humidity='" + humidity + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
