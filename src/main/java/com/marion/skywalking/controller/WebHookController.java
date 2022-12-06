package com.marion.skywalking.controller;

import com.marion.skywalking.controller.request.AlarmMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/webhook")
public class WebHookController {

    /**
     * 告警规则1：
     * 10分钟接口响应时间超过1s的请求大于3次
     */
    @GetMapping("/slow")
    public Object slowQuery() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "success";
    }

    @GetMapping("/log/error")
    public Object error() {
        log.error("error log....");
        return "success";
    }
    @GetMapping("/log/info")
    public Object info() {
        log.info("info log....");
        return "success";
    }

    @PostMapping("/alarm")
    public void alarm(@RequestBody List<AlarmMessage> alarmMessageList) {
        System.out.println(alarmMessageList);
    }

}
