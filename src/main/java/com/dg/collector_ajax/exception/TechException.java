package com.dg.collector_ajax.exception;

public class TechException extends BaseException {
    public TechException(ResultCode rc) {
        super(rc);
    }
    public TechException(ResultCode rc, Object extra) {
        super(rc, extra);
    }
}
