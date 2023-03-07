package ej6Mediator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChatRoom chat = new ChatRoom();

        Developer desarrollador1 = new Developer("Juan", chat);
        Developer desarrollador2 = new Developer("Maria", chat);
        Developer desarrollador3 = new Developer("Pedro", chat);

        desarrollador1.enviarMensaje("Hola a todos!");

        desarrollador1.enviarMensajePersonal("Hola Maria!", desarrollador2);
    }
}