package ej4;

import java.util.ArrayList;
import java.util.List;

class CanalWhatsapp implements Mediator {
    List<Usuario> usuarios = new ArrayList<>();

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void enviarMensaje(String mensaje, Usuario emisor, Usuario receptor) {
        if (usuarios.contains(emisor) && usuarios.contains(receptor)) {
            receptor.recibirMensaje(mensaje, emisor);
        } else {
            System.out.println("El usuario no se encuentra en este canal");
        }
    }
}

