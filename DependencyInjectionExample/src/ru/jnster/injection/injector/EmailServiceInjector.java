package ru.jnster.injection.injector;

import ru.jnster.injection.consumer.MessageConsumer;
import ru.jnster.injection.service.EmailService;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public MessageConsumer getConsumer() {
        return new MessageConsumer(new EmailService());
    }
}
