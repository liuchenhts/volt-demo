package au.com.chen.voltdemo.resourceserver.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ConsumerService {

    private final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void consumeWorker1(String message) throws IOException {
        logger.info(String.format("------>Processor 1 Consumed message: %s", message));
    }

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void consumeWorker2(String message) throws IOException {
        logger.info(String.format("------>Processor 2 Consumed message: %s", message));
    }

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void consumeWorker3(String message) throws IOException {
        logger.info(String.format("------>Processor 3 Consumed message: %s", message));
    }
}
