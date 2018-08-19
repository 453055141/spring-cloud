package com.zk.controller;

import com.zk.feignapi.SendService;
import com.zk.feignapi.SendSmsService;
import com.zk.service.MessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zengkai
 * @Description: 测试
 * @date 2018/8/16 11:46
 */
@RefreshScope
@Slf4j
@RestController
@RequestMapping("sso")
public class Test {


    @Autowired
    private SendSmsService sendSmsService;

    @Autowired
    private SendService sendService;

    @Autowired
    private MessageProvider messageProvider;

    @Value("${name}")
    String name;

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
        return sendService.sendSms("sso服务消息");
    }

    @RequestMapping("test4")
    public String getTest4(){
        Map map = new HashMap();
        map.put("name","zk");
        map.put("age",27);
        messageProvider.send(map);
        return "ok";
    }

    @RequestMapping("test5")
    public String getTest5(){
        log.info(name);
        return name;
    }

    @RequestMapping("test6")
    public String getTest6(){
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
        return "ok";
    }
}
