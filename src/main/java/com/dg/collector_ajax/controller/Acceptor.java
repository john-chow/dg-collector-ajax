package com.dg.collector_ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dg.collector_ajax.vo.HttpResp;


@Controller
@RequestMapping("acceptor")
public class Acceptor {
    public Acceptor() {
        System.out.println("Contronller");
    }

    @ResponseBody
    @RequestMapping("/web/performance")
    public HttpResp getReportWebPerformance() {
        return HttpResp.buildSucc();
    }

    @ResponseBody
    @RequestMapping("/web/behavior")
    public HttpResp getReportWebBehavior() {
        return HttpResp.buildSucc();
    }
}

