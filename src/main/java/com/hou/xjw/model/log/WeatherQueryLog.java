package com.hou.xjw.model.log;

import java.util.Date;

public class WeatherQueryLog {

    private Integer id;
    private String cityCode;
    private String cityName;
    private Date queryTime;
    private Integer opUser;
    private Integer isFromCache; // 是否取自缓存
    private Integer isFromDB; // 是否取自数据库
    private Integer isFromApi; // 是否请求其外部接口
    private String queryStatus; // 是否查询成功
    private String resultId; // 天气预报查询的结果id
    private String doPageCode; // 查询触发的页面

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Date getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(Date queryTime) {
        this.queryTime = queryTime;
    }

    public Integer getOpUser() {
        return opUser;
    }

    public void setOpUser(Integer opUser) {
        this.opUser = opUser;
    }

    public Integer getIsFromCache() {
        return isFromCache;
    }

    public void setIsFromCache(Integer isFromCache) {
        this.isFromCache = isFromCache;
    }

    public Integer getIsFromDB() {
        return isFromDB;
    }

    public void setIsFromDB(Integer isFromDB) {
        this.isFromDB = isFromDB;
    }

    public Integer getIsFromApi() {
        return isFromApi;
    }

    public void setIsFromApi(Integer isFromApi) {
        this.isFromApi = isFromApi;
    }

    public String getQueryStatus() {
        return queryStatus;
    }

    public void setQueryStatus(String queryStatus) {
        this.queryStatus = queryStatus;
    }

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public String getDoPageCode() {
        return doPageCode;
    }

    public void setDoPageCode(String doPageCode) {
        this.doPageCode = doPageCode;
    }
}
