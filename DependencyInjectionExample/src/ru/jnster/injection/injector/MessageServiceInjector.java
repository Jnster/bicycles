package ru.jnster.injection.injector;

import ru.jnster.injection.consumer.MessageConsumer;

public interface MessageServiceInjector {

    MessageConsumer getConsumer();

}
