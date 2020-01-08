package au.com.chen.voltdemo.resourceserver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
public class KafkaConfig {

    @Value("${app.topic-name}")
    private String topicName;

    @Bean
    public NewTopic adviceTopic() {
        return new NewTopic(topicName, 3, (short) 1);
    }
}