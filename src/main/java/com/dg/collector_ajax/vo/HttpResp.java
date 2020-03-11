package com.dg.collector_ajax.vo;

import com.dg.collector_ajax.vo.Constant;

public class HttpResp {
    private Integer ret;
    private String msg;
    private Object data;

    public HttpResp(Integer ret) {
        this.ret = ret;
    }

    public HttpResp(Integer ret, String msg) {
        this.ret = ret;
        this.msg = msg;
    }

    public HttpResp(Integer ret, Object data) {
        this.ret = ret;
        this.data = data;
    }

    public static HttpResp buildSucc() {
        return new HttpResp(Constant.RESP_SUCC_RET);
    }

    public static HttpResp buildSucc(Object data) {
        return new HttpResp(Constant.RESP_SUCC_RET, data);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getRet() {
        return ret;
    }

    public void setRet(Integer ret) {
        this.ret = ret;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
