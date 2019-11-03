package ru.jnster.consumer;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.jnster.service.MessageService;

@Configuration
@ComponentScan(value = "ru.jnster.consumer")
public class MessageServiceConsumerTest {

    private AnnotationConfigApplicationContext configApplicationContext = null;

    @Bean
    public MessageService getMessageService() {
        return (to, content) -> {
            System.out.println("Mocked service for " + to + ": " + content);
            return true;
        };
    }

    @Before
    public void setUp() {
        configApplicationContext = new AnnotationConfigApplicationContext(MessageServiceConsumerTest.class);
    }

    @After
    public void tearDown() {
        configApplicationContext.close();
    }

    @Test
    public void sendMessage() {
        MessageServiceConsumer serviceConsumer = configApplicationContext.getBean(MessageServiceConsumer.class);
        Assert.assertTrue(serviceConsumer.sendMessage("Tester Testerov", "Service is testing."));
    }
}