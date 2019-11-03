package ru.jnster.consumer;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMessageServiceConsumerTest {

    private ClassPathXmlApplicationContext classPathXmlApplicationContext = null;

    @Before
    public void setUp() {
        classPathXmlApplicationContext = new ClassPathXmlApplicationContext("facebookConfiguration.xml");
    }

    @After
    public void tearDown() {
        classPathXmlApplicationContext.close();
    }

    @Test
    public void sendMessage() {
        XmlMessageServiceConsumer xmlMessageServiceConsumer = classPathXmlApplicationContext.getBean(XmlMessageServiceConsumer.class);
        Assert.assertTrue(xmlMessageServiceConsumer.sendMessage("Dog", "Good boy!"));
    }
}