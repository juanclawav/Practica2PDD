package ej6Mediator;

class ChatOne implements ChatMediator {
    @Override
    public void enviarMensaje(String mensaje, Developer receptor) {
        receptor.recibirMensaje(mensaje);
    }
}
