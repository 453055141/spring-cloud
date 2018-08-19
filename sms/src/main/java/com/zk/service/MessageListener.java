package com.zk.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Description 消息接受
 * @Author zengkai
 * @Date 2018/8/18 2:56
 */
@Component
@EnableBinding(Sink.class)
public class MessageListener {
    @StreamListener(Sink.INPUT)
    public void input(Message<Map> message) {
        System.out.println("【*** 消息接收 ***】" + message.getPayload());
    }
}
