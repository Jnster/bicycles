package ru.jnster.injection.injector;

import ru.jnster.injection.consumer.MessageConsumer;
import ru.jnster.injection.service.FacebookService;

public class FacebookServiceInjector implements MessageServiceInjector {

    @Override
    public MessageConsumer getConsumer() {
        return new MessageConsumer(new FacebookService());
    }
}
