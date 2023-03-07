package ej6Mediator;

class Developer {
    private String nombre;
    private ChatRoom chat;
    private ChatOne chat1 = new ChatOne();
    public Developer(String nombre, ChatRoom chat) {
        this.nombre = nombre;
        this.chat = chat;
        chat.agregarDesarrollador(this);
    }

    public void enviarMensaje(String mensaje) {
        System.out.println(nombre + " envió el mensaje: " + mensaje);
        chat.enviarMensaje(mensaje, this);
    }

    public void enviarMensajePersonal(String mensaje, Developer destinatario) {
        System.out.println(nombre + " envió el mensaje personal: " + mensaje);
        chat1.enviarMensaje(mensaje, destinatario);
    }

    public void recibirMensaje(String mensaje) {
        System.out.println(nombre + " recibió el mensaje: " + mensaje);
    }
}
