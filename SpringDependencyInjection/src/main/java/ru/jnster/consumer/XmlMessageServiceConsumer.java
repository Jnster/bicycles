package ru.jnster.consumer;

import ru.jnster.service.MessageService;

public class XmlMessageServiceConsumer {

    private MessageService service;

    public XmlMessageServiceConsumer(MessageService service) {
        this.service = service;
    }

    public boolean sendMessage(String to, String content) {
        return service.sendMessage(to, content);
    }
}
