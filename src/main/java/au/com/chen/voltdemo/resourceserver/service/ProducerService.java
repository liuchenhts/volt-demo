package au.com.chen.voltdemo.resourceserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    String kafkaTopic = "user";

    public void send(String data) {

        kafkaTemplate.send(kafkaTopic, data);
    }
}
