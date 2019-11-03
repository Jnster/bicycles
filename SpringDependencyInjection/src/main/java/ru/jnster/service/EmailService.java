package ru.jnster.service;

public class EmailService implements MessageService {

    public boolean sendMessage(String to, String content) {
        System.out.println("Email for " + to + ": " + content);
        return true;
    }
}
