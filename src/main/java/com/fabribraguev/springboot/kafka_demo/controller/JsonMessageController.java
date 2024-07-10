package com.fabribraguev.springboot.kafka_demo.controller;

import com.fabribraguev.springboot.kafka_demo.kafka.JsonKafkaProducer;
import com.fabribraguev.springboot.kafka_demo.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {
    @Autowired
    JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user) {
        System.out.println(user.toString());
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("JsonMessage sent to the topic");
    }

}
