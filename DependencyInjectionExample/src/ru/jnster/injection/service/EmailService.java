package ru.jnster.injection.service;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String to, String content) {
        //instead of sending email logic
        System.out.println("Email for " + to + ": " + content);
    }
}
