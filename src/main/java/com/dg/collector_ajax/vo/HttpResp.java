package com.dg.collector_ajax.vo;

import com.dg.collector_ajax.vo.Constant;

public class HttpResp<T> {
    private Integer ret;
    private String msg;
    private T data;

    public HttpResp(RespCode rp) {
        this.ret = rp.ret;
        this.msg = rp.msg;
    }

    public static HttpResp buildSucc() {
        return new HttpResp(RespCode.SUCCESS);
    }

//    public static HttpResp<T> buildSucc(T data) {
//        return new HttpResp(Constant.RESP_SUCC_RET, data);
//    }

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
