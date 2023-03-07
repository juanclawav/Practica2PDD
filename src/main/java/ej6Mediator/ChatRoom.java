package ej6Mediator;

import java.util.ArrayList;
import java.util.List;

class ChatRoom implements ChatMediator {
    private List<Developer> desarrolladores;

    public ChatRoom() {
        this.desarrolladores = new ArrayList<>();
    }

    public void agregarDesarrollador(Developer desarrollador) {
        this.desarrolladores.add(desarrollador);
    }

    @Override
    public void enviarMensaje(String mensaje, Developer remitente) {
        for (Developer desarrollador : desarrolladores) {
            if (desarrollador != remitente) {
                desarrollador.recibirMensaje(mensaje);
            }
        }
    }
}
