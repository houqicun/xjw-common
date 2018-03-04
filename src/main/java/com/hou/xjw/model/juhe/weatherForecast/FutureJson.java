package com.hou.xjw.model.juhe.weatherForecast;

/**
 *
 * 为聚合数据返回的JSON做处理用的model ：未来天气处理
 *
 * temperature 温度
 * weather 天气
 * weather_id 天气唯一标识
 * wind 风向风力
 * week 星期
 * date 日期（年月日，连续数字串）
 *
 * */

public class FutureJson {

    private String temperature;
    private String weather;
    private String weather_id;
    private String wind;
    private String week;
    private String date;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWeather_id() {
        return weather_id;
    }

    public void setWeather_id(String weather_id) {
        this.weather_id = weather_id;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
