package ej3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Celular> celulares = new ArrayList<>();
        celulares.add(new Celular("Galaxy S21", "Samsung", "Alta gama", 1200));
        celulares.add(new Celular("iPhone 13 Pro", "Apple", "Alta gama", 1300));
        celulares.add(new Celular("Galaxy A52", "Samsung", "Media gama", 400));
        celulares.add(new Celular("Moto G10", "Motorola", "Baja gama", 200));

        TiendaCelulares tienda = new TiendaCelulares(celulares);
        tienda.setThreshold(2);

        List<Celular> resultado;
        resultado = tienda.buscar("Galaxy A52",400);
        System.out.println("Resultados de la búsqueda:");
        for (Celular celular : resultado) {
            System.out.println(celular.getMarca()+"  "+celular.getModelo()+"  "+celular.getPrecio());
        }
    }
}