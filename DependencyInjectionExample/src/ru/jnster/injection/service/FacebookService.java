package ru.jnster.injection.service;

public class FacebookService implements MessageService {

    @Override
    public void sendMessage(String to, String content) {
        //instead of sending facebook message logic
        System.out.println("Facebook message for " + to + ": " + content);
    }
}
