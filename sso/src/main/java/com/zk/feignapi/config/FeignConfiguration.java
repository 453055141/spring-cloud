package com.zk.feignapi.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @author zengkai
 * @Description:
 * @date 2018/8/16 13:13
 */
@Configuration
public class FeignConfiguration {

    /**
     *  feign在远程调用失败后会进行重试
     */
    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1),5);
    }
}
