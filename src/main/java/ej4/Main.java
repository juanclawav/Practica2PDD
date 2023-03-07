package ej4;

public class Main {
    public static void main(String[] args) {
        CanalWhatsapp canal = new CanalWhatsapp();

        Usuario usuario1 = new Usuario("Usuario 1", canal);
        canal.agregarUsuario(usuario1);
        Usuario usuario2 = new Usuario("Usuario 2", canal);
        canal.agregarUsuario(usuario2);
        Usuario usuario3 = new Usuario("Usuario 3", canal);
        canal.agregarUsuario(usuario3);
        Usuario usuario4 = new Usuario("Usuario 4", canal);
        canal.agregarUsuario(usuario4);
        Usuario usuario5 = new Usuario("Usuario 5", canal);
        canal.agregarUsuario(usuario5);
        Usuario usuario6 = new Usuario("Usuario 6", canal);
        canal.agregarUsuario(usuario6);
        Usuario usuario7 = new Usuario("Usuario 7", canal);
        canal.agregarUsuario(usuario7);
        Usuario usuario8 = new Usuario("Usuario 8", canal);
        canal.agregarUsuario(usuario8);
        Usuario usuario9 = new Usuario("Usuario 9", canal);
        canal.agregarUsuario(usuario9);
        Usuario usuario10 = new Usuario("Usuario 10", canal);
        canal.agregarUsuario(usuario10);

        usuario1.enviarMensaje("Hola, ¿cómo estás?", usuario2);

        for (Usuario usuario : canal.usuarios) {
            if (!usuario.equals(usuario10)) {
                usuario10.enviarMensaje("Buenos días a todos", usuario);
            }
        }
    }
}
