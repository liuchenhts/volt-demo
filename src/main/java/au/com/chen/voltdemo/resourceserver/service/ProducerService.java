package au.com.chen.voltdemo.resourceserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${app.topic-name}")
    private String topicName;

    public void send(String data) {

        kafkaTemplate.send(topicName, data);
    }
}
