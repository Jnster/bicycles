package ru.jnster.service;

public class FacebookService implements MessageService {

    public boolean sendMessage(String to, String content) {
        System.out.println("Facebook message for " + to +": " + content);
        return true;
    }
}
