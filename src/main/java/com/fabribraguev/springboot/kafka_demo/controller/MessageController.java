package com.fabribraguev.springboot.kafka_demo.controller;

import com.fabribraguev.springboot.kafka_demo.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {
    @Autowired
    private KafkaProducer kafkaProducer;
    //http://localhost:8090/api/v1/kafka/publish?message=hola 1
    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message) {
        System.out.println(message);
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to the topic");
    }
}
