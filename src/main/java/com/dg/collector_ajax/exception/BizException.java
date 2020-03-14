package com.dg.collector_ajax.exception;

public class BizException extends BaseException {
    public BizException(ResultCode rc) {
        super(rc);
    }
    public BizException(ResultCode rc, Object extra) {
        super(rc, extra);
    }
}

