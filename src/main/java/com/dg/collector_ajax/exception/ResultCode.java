package com.dg.collector_ajax.exception;

public enum ResultCode {
    BEHAVIOR_PARAM_INVALID("101000", "用户提交参数校验不通过"),
    ANY_UNKNOWN_ERROR("199999", "未知异常");

    public final String code;
    public final String desc;
    private ResultCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
