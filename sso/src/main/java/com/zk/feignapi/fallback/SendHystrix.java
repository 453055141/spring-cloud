package com.zk.feignapi.fallback;

import com.zk.feignapi.SendService;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SendHystrix implements FallbackFactory<SendService> {

    private static final Logger log = LoggerFactory.getLogger(SendHystrix.class);

    @Override
    public SendService create(Throwable throwable) {
        return new SendService() {
            @Override
            public String sendSms(String sms) {
                log.error("异常处理={}", throwable);
                return "Execute raw fallback: access service fail , req= " + sms + " reason = " + throwable;
            }
        };
    }

}
