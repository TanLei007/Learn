package com.gl.springbootkafkaapi.controller;

import com.gl.springbootkafkaapi.constant.KafkaConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 测试
 * @author: TL
 * @create: 2019-05-18 21:18
 **/
@RestController
@RequestMapping("/kafka")
public class Test {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    /**
     * 发送数据
     */
    @PutMapping
    public void putKafka(){
        kafkaTemplate.send(KafkaConstant.topics_1, "他呢里");
    }
}
