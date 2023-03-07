package ej1;

class DocumentoTesis {
    private String contenido;

    public DocumentoTesis(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    // Método que permite cambiar el contenido del documento
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    // Método que devuelve un objeto Memento con el estado actual del documento
    public Memento guardar() {
        return new Memento(contenido);
    }

    // Método que establece el estado del documento a partir del Memento dado
    public void restaurar(Memento memento) {
        contenido = memento.getContenido();
    }
}

