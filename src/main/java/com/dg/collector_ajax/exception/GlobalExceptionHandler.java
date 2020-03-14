package com.dg.collector_ajax.exception;

import com.dg.collector_ajax.vo.HttpResp;
import com.dg.collector_ajax.vo.RespCode;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.dg.collector_ajax.vo.HttpResp;
import com.dg.collector_ajax.vo.RespCode;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler
    public HttpResp handleNotValidException(IllegalArgumentException e) {
        HttpResp resp = new HttpResp(RespCode.COLLECTORAJAX_BEHAVIOR_PARAM_INVALID);
        return resp;
    }

    @ExceptionHandler
    public HttpResp handleException(Exception e) {
        HttpResp resp = new HttpResp(RespCode.ANY_UNKNOWN_ERROR);
        return resp;
    }
}
