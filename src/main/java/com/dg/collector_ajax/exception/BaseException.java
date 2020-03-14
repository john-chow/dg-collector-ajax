package com.dg.collector_ajax.exception;

import java.io.Serializable;

public class BaseException extends RuntimeException implements Serializable {
    private String code;
    private String desc;
    private Object extra;

    public BaseException(ResultCode rc) {
        super(rc.desc);
        this.code = rc.code;
    }

    public BaseException(ResultCode rc, Object extra) {
        super(rc.desc);
        this.code = rc.code;
        this.extra = extra;
    }
}
