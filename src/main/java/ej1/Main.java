package ej1;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Este es el contenido inicial de mi tesis.");

        estudiante.guardarRevision();
        System.out.println("Revisión 1: " + estudiante.getContenido());

        estudiante.documento.setContenido("Contenido de la revisión 2 de mi tesis.");
        estudiante.guardarRevision();
        System.out.println("Revisión 2: " + estudiante.getContenido());

        estudiante.documento.setContenido("Contenido de la revisión 3 de mi tesis.");
        estudiante.guardarRevision();
        System.out.println("Revisión 3: " + estudiante.getContenido());

        estudiante.documento.setContenido("Contenido de la revisión 4 de mi tesis.");
        estudiante.guardarRevision();
        System.out.println("Revisión 4: " + estudiante.getContenido());

        estudiante.documento.setContenido("Contenido de la revisión 5 de mi tesis.");
        estudiante.guardarRevision();
        System.out.println("Revisión 5: " + estudiante.getContenido());

        estudiante.restaurarRevision(3);
        System.out.println("Contenido de la tercera revisión: " + estudiante.getContenido());
    }
}