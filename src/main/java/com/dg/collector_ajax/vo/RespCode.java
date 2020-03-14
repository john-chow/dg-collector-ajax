package com.dg.collector_ajax.vo;

public enum RespCode {
    SUCCESS(0000000, "成功"),
    COLLECTORAJAX_BEHAVIOR_PARAM_INVALID(1001000, "请检查传入参数"),
    ANY_UNKNOWN_ERROR(9999999, "服务忙碌，请稍后重试");
    public final Integer ret;
    public final String msg;

    private RespCode(Integer ret, String msg) {
        this.ret = ret;
        this.msg = msg;
    }
}
