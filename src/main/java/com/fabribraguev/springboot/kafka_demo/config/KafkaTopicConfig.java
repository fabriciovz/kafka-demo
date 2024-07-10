package com.fabribraguev.springboot.kafka_demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic sampleTopic(){
        return TopicBuilder.name("sample-topic").
                partitions(1).build();
    }
    @Bean
    public NewTopic sampleTopicJson(){
        return TopicBuilder.name("sample-topic-v2").
                partitions(1).build();
    }
}
