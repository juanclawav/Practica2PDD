package ej3;

public class Celular {
    private String modelo;
    private String marca;
    private String gama;
    private int precio;

    public Celular(String modelo, String marca, String gama, int precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.gama = gama;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getGama() {
        return gama;
    }

    public double getPrecio() {
        return precio;
    }
}
