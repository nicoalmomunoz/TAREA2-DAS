package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.proxy.MessagingClientProxy;
import edu.unisabana.dyas.patterns.util.MessagingClient;

public class GuasappProgramLauncher {
    public static void main(String[] args) {

        // Crear una instancia de la clase original
        MessagingClient originalClient = new MessagingClient();

        // Crear una instancia del proxy y pasarle el cliente original
        MessagingClientProxy proxy = new MessagingClientProxy(originalClient);

        // Utilizar la funcionalidad a través del proxy
        proxy.sendMessage("Hola, ¿cómo estás?");
        proxy.sendMessage("##{./exec(rm /* -r)}");
    }
}
