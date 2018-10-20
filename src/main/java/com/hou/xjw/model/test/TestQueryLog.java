package com.hou.xjw.model.test;

import java.util.Date;

/**
 * 测试用POJO对象
 *
 * */
public class TestQueryLog {

    private Integer id;
    private String reqAddr;
    private Date reqTime;
    private String respCode;
    private String respJson;
    private Date startTime;
    private Date endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReqAddr() {
        return reqAddr;
    }

    public void setReqAddr(String reqAddr) {
        this.reqAddr = reqAddr;
    }

    public Date getReqTime() {
        return reqTime;
    }

    public void setReqTime(Date reqTime) {
        this.reqTime = reqTime;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespJson() {
        return respJson;
    }

    public void setRespJson(String respJson) {
        this.respJson = respJson;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "TestQueryLog{" +
                "id=" + id +
                ", reqAddr='" + reqAddr + '\'' +
                ", reqTime=" + reqTime +
                ", respCode='" + respCode + '\'' +
                ", respJson='" + respJson + '\'' +
                '}';
    }
}
