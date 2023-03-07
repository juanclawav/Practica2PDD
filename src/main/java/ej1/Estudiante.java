package ej1;

import java.util.ArrayList;
import java.util.List;

class Estudiante {
    DocumentoTesis documento;
    private List<Memento> revisiones = new ArrayList<>();

    public Estudiante(String contenido) {
        documento = new DocumentoTesis(contenido);
    }

    // Método que guarda el estado actual del documento en un Memento
    public void guardarRevision() {
        revisiones.add(documento.guardar());
    }

    // Método que devuelve el estado anterior del documento guardado en el Memento dado
    public void restaurarRevision(int indice) {
        Memento memento = revisiones.get(indice);
        documento.restaurar(memento);
    }

    // Método que devuelve el contenido actual del documento de la tesis
    public String getContenido() {
        return documento.getContenido();
    }
}

