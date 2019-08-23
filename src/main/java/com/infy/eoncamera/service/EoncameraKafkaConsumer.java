package com.infy.eoncamera.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class EoncameraKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(EoncameraKafkaConsumer.class);
    private static final String TOPIC = "topic_eoncamera";

    @KafkaListener(topics = "topic_eoncamera", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
