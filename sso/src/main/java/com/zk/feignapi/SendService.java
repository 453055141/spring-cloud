package com.zk.feignapi;

import com.zk.feignapi.config.FeignConfiguration;
import com.zk.feignapi.fallback.SendHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * value:表示消费哪个服务的接口，path：统一前缀，controller类的@RequestMapping("sms")的地址
 * configuration:可以自定义配置信息来覆盖Feign的默认配置，比如配置日志输出
 * fallback：可以让接口在熔断处理时，返回默认的值给调用方
 */
@FeignClient(value = "sms",path = "/sms",configuration = FeignConfiguration.class,fallbackFactory = SendHystrix.class)
public interface SendService {

    @RequestMapping(value = "/testhystrix",method = RequestMethod.GET)
    String sendSms(@RequestParam("sms") String sms);
}
