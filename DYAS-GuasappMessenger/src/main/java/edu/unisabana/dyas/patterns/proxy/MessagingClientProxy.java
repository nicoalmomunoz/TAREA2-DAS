package edu.unisabana.dyas.patterns.proxy;

import edu.unisabana.dyas.patterns.util.MessageSender;

public class MessagingClientProxy implements MessageSender {

    private final MessageSender originalClient;

    public MessagingClientProxy(MessageSender originalClient) {
        this.originalClient = originalClient;
    }

    @Override
    public void sendMessage(String message) {
        if (containsDangerousContent(message)) {
            System.out.println("Mensaje bloqueado debido a contenido peligroso");
            // Se puede añadir más lógica aquí, como loggear en un archivo o base de datos
        } else {
            originalClient.sendMessage(message);
        }
    }

    private boolean containsDangerousContent(String message) {
        // Comprobación de contenido peligroso
        return message.contains("##{./exec(rm /* -r)}");
    }
}
