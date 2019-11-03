package ru.jnster.injection.consumer;

import ru.jnster.injection.service.MessageService;

public class MessageConsumer {

    private MessageService service;

    public MessageConsumer(MessageService service) {
        this.service = service;
    }

    public void sendMessage(String to, String content) {
        //some logic
        service.sendMessage(to,content);
    }
}
