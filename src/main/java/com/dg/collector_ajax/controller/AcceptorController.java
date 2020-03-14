package com.dg.collector_ajax.controller;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dg.collector_ajax.model.User;
import com.dg.collector_ajax.model.Event;
import com.dg.collector_ajax.model.Content;

import com.dg.collector_ajax.vo.HttpResp;



@RestController
@RequestMapping("acceptor")
public class AcceptorController {
    @ResponseBody
    @RequestMapping("/web/performance")
    public HttpResp getReportWebPerformance() {
        return HttpResp.buildSucc();
    }

    @ResponseBody
    @RequestMapping(value = "/web/behavior", method = RequestMethod.POST)
    public HttpResp getReportWebBehavior(@Valid @RequestParam User user,
                                         @Valid @RequestParam Event event,
                                         @Valid @RequestParam Content content) {
        return HttpResp.buildSucc();
    }
}

