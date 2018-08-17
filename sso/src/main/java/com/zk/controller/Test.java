package com.zk.controller;

import com.zk.feignapi.SendSmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zengkai
 * @Description: 测试
 * @date 2018/8/16 11:46
 */
@RestController
@RequestMapping("sso")
public class Test {

    @Autowired
    private SendSmsService sendSmsService;

    @Autowired
    private com.zk.feignapi.SendService SendService;

    @RequestMapping("test1")
    public String getTest1(){
        return "zk";
    }

    @RequestMapping("test2")
    public String getTest2(){
        return sendSmsService.sendSms("sso服务消息");
    }

    @RequestMapping("test3")
    public String getTest3(){
        return SendService.sendSms("sso服务消息");
    }
}
