package ej7SingletonChainOfResponsibility;

public class Main {
    public static void main(String[] args) {

        Prestamo.getInstance().setCantidadOriginal(1000);

        Banco banco = new Banco();

        banco.handle(150);
        banco.handle(200);
        banco.handle(100);
        banco.handle(350);
        banco.handle(200);
    }
}

