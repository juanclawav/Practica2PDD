package ej7SingletonChainOfResponsibility;

public class Supervisor implements IAgentePago {
    private IAgentePago next;

    @Override
    public void setNext(IAgentePago agentePago) {
        next = agentePago;
    }

    @Override
    public IAgentePago next() {
        return next;
    }

    @Override
    public void handle(int cantidad) {

        if (Prestamo.getInstance().getCantidadPagada() < Prestamo.getInstance().getCantidadOriginal()) {
            Prestamo.getInstance().setCantidadPagada(Prestamo.getInstance().getCantidadPagada() + cantidad);
            System.out.println("Pago realizado con exito al Supervisor, Desea algun prestamo más?");
            if (Prestamo.getInstance().getCantidadPagada() >= Prestamo.getInstance().getCantidadOriginal()) {
                System.out.println("Ha completado la totalidad de su pago. Le enviaremos con el Encargado de Prestamos.");
                next.handle(cantidad);
            }
        } else {
            next.handle(cantidad);
        }
    }

}
