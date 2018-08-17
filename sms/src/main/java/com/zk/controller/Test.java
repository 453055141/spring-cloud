package com.zk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zengkai
 * @Description:
 * @date 2018/8/16 12:58
 */
@RestController
@RequestMapping("sms")
public class Test {
    private static final Logger log  = LoggerFactory.getLogger(Test.class);
    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String getSmsTest(@RequestParam("sms") String sms){
        log.info("8764");
        return "这是"+sms+"调用sms服务"+8764;
    }

    @RequestMapping(value = "testhystrix",method = RequestMethod.GET)
    public String getSmsTestHystrix(@RequestParam("sms") String sms){
        log.info("8764");
        return "这是"+sms+"调用sms服务"+8764;
    }
}
