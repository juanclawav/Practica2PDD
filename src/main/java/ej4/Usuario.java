package ej4;

class Usuario {
    private String nombre;
    private Mediator mediator;

    public Usuario(String nombre, Mediator mediator) {
        this.nombre = nombre;
        this.mediator = mediator;
    }

    public void enviarMensaje(String mensaje, Usuario receptor) {
        mediator.enviarMensaje(mensaje, this, receptor);
    }

    public void recibirMensaje(String mensaje, Usuario emisor) {
        System.out.println(nombre + " recibió el mensaje '" + mensaje + "' de " + emisor.getNombre());
    }

    public String getNombre() {
        return nombre;
    }
}
