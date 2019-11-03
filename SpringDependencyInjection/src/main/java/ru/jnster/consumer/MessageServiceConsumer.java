package ru.jnster.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.jnster.service.MessageService;

@Component
public class MessageServiceConsumer {

    private MessageService messageService;

    @Autowired
    public MessageServiceConsumer(MessageService messageService) {
        this.messageService = messageService;
    }

    public boolean sendMessage(String to, String content) {
        return messageService.sendMessage(to, content);
    }
}
