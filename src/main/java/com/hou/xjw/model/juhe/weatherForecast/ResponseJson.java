package com.hou.xjw.model.juhe.weatherForecast;

/**
 *
 * 为聚合数据返回的JSON做处理用的model ：返回层处理
 *
 * 后期梳理其他方面接口的相应JSON，提取为BaseModel
 *
 * resultcode 返回码
 * reason 返回信息
 * result 结果
 * error_code 错误码
 *
 * */

public class ResponseJson {

    private String resultcode;
    private String reason;
    private String result;
    private String error_code;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    @Override
    public String toString() {
        return "ResponseJson{" +
                "resultcode='" + resultcode + '\'' +
                ", reason='" + reason + '\'' +
                ", result='" + result + '\'' +
                ", error_code='" + error_code + '\'' +
                '}';
    }
}
