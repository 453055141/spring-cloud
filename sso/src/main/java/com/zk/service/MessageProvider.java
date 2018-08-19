package com.zk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @Description 消息发送
 * @Author zengkai
 * @Date 2018/8/18 1:10
 */

@EnableBinding(Source.class) // 可以理解为是一个消息的发送管道的定义
public class MessageProvider {


    /**
     * 消息的发送管道
     */
    @Autowired
    @Qualifier("output")
    MessageChannel output;

    public void send(Object object) {
        output.send(MessageBuilder.withPayload(object).build());
    }
}
