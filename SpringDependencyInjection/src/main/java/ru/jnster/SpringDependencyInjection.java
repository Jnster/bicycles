package ru.jnster;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.jnster.configuration.DIEmailConfiguration;
import ru.jnster.consumer.MessageServiceConsumer;

public class SpringDependencyInjection {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext contextEmail = new AnnotationConfigApplicationContext(DIEmailConfiguration.class);
        MessageServiceConsumer consumerEmail = contextEmail.getBean(MessageServiceConsumer.class);

        consumerEmail.sendMessage("Tuta@pol.we", "Message.");

        contextEmail.close();

        AnnotationConfigApplicationContext contextFacebook = new AnnotationConfigApplicationContext(DIEmailConfiguration.class);
        MessageServiceConsumer consumerFacebook = contextFacebook.getBean(MessageServiceConsumer.class);

        consumerFacebook.sendMessage("Fara", "Youth message.");

        contextFacebook.close();
    }
}
