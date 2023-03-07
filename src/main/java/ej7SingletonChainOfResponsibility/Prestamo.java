package ej7SingletonChainOfResponsibility;

public class Prestamo {
    private static Prestamo instance;

    private int cantidadOriginal = 0;

    private int cantidadPagada = 0;

    private Prestamo() {
    }

    public static Prestamo getInstance() {

        if (instance == null) {
            instance = new Prestamo();
        }
        return instance;
    }

    public int getCantidadOriginal() {
        return cantidadOriginal;
    }

    public void setCantidadOriginal(int cantidadOriginal) {
        this.cantidadOriginal = cantidadOriginal;
    }

    public int getCantidadPagada() {
        return cantidadPagada;
    }

    public void setCantidadPagada(int cantidadPagada) {
        this.cantidadPagada = cantidadPagada;
    }


}
