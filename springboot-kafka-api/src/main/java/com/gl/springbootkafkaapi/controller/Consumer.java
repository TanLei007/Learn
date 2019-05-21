package com.gl.springbootkafkaapi.controller;

import com.gl.springbootkafkaapi.constant.KafkaConstant;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Consumer {
    @KafkaListener(topics = {KafkaConstant.TOPICS_1}, groupId = KafkaConstant.GROUPID_1)
    public void consumer1(ConsumerRecord<?, ?> consumerRecord) {
        //判断是否为null
        Optional<?> kafkaMessage = Optional.ofNullable(consumerRecord.value());
        if (kafkaMessage.isPresent()) {
            //得到Optional实例中的值
            Object message = kafkaMessage.get();
            System.err.println("消费消息1:" + message);
        }
    }

    @KafkaListener(topics = {KafkaConstant.TOPICS_1}, groupId = KafkaConstant.GROUPID_2)
    public void consumer2(ConsumerRecord<?, ?> consumerRecord) {
        //判断是否为null
        Optional<?> kafkaMessage = Optional.ofNullable(consumerRecord.value());
        if (kafkaMessage.isPresent()) {
            //得到Optional实例中的值
            Object message = kafkaMessage.get();
            System.err.println("消费消息2:" + message);
        }
    }
}