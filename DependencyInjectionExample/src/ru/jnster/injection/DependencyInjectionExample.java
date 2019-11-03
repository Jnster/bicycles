package ru.jnster.injection;

import java.util.Scanner;
import ru.jnster.injection.consumer.MessageConsumer;
import ru.jnster.injection.injector.EmailServiceInjector;
import ru.jnster.injection.injector.FacebookServiceInjector;

public class DependencyInjectionExample {

    public static void main(String[] args) {
        String content = "Very impotent message.";
        String email = "Vivaldi@mu.zlo";
        String publicId = "Kartman99";
        MessageConsumer facebookConsumer = new FacebookServiceInjector().getConsumer();
        MessageConsumer emailConsumer = new EmailServiceInjector().getConsumer();
        boolean cont = true;
        Scanner scanner = new Scanner(System.in);

        while (cont) {
            System.out.println("Write\n1 - send \"Email\"\n2 - send \"Facebook message\"\nother - exit");
            switch (scanner.nextInt()) {
                case 1:
                    emailConsumer.sendMessage(email, content);
                    break;
                case 2:
                    facebookConsumer.sendMessage(publicId, content);
                    break;
                default:
                    cont = false;
            }
        }

    }
}
