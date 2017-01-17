package com.hdsx.mq.main;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.Connection;
import javax.jms.JMSException;

/**
 * Created by admin on 2017/1/17.
 */
public class Initialization {

    public static Connection connection = null;

    public Initialization() {

    }

    public static void main(String[] args) throws JMSException {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("", "", "tcp://10.10.40.174:61616");
        connection = connectionFactory.createConnection();
    }
}
