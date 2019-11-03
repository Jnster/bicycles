package ru.jnster;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.jnster.configuration.DIConfiguration;
import ru.jnster.consumer.MessageServiceConsumer;
import ru.jnster.consumer.XmlMessageServiceConsumer;

public class SpringDependencyInjection {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
            DIConfiguration.class);
        MessageServiceConsumer messageServiceConsumer = applicationContext.getBean(MessageServiceConsumer.class);

        messageServiceConsumer.sendMessage("Tuta@pol.we", "Message.");

        applicationContext.close();

        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(
            "facebookConfiguration.xml");
        XmlMessageServiceConsumer xmlMessageServiceConsumer = xmlApplicationContext
            .getBean(XmlMessageServiceConsumer.class);

        xmlMessageServiceConsumer.sendMessage("Cat", "Youth message.");

        xmlApplicationContext.close();
    }
}
