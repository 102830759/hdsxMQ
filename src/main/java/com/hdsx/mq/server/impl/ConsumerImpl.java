package com.hdsx.mq.server.impl;

import com.hdsx.mq.server.Consumer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

/**
 * 消息消费者
 * Created by admin on 2016/9/28.
 *
 * 点对点消息处理
 */

@Service
@Component
public class ConsumerImpl implements Consumer {

    public void onMessage(Message message) {
        TextMessage textMsg = (TextMessage) message;
        try {
            System.out.println("消息内容是：" + textMsg.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}