package com.zk.feignapi.fallback;


import com.zk.feignapi.SendSmsService;
import org.springframework.stereotype.Component;

/**
 * @author zengkai
 * @Description: 熔断处理
 * @date 2018/8/16 13:21
 */
@Component
public class SendSmsServiceHystrix implements SendSmsService {
    @Override
    public String sendSms(String sms) {
        return "调用错误，返回默认值"+sms;
    }
}
