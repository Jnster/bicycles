package ru.jnster.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.jnster.service.FacebookService;
import ru.jnster.service.MessageService;

@Configuration
@ComponentScan(value = "ru.jnster.consumer")
public class DIFacebookConfiguration {

    @Bean
    public MessageService getFacebookMessageService() {
        return new FacebookService();
    }
}
