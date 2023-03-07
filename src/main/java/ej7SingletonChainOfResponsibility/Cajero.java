package ej7SingletonChainOfResponsibility;

public class Cajero implements IAgentePago {
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
        if (Prestamo.getInstance().getCantidadPagada() < (Prestamo.getInstance().getCantidadOriginal() * 25) / 100) {
            Prestamo.getInstance().setCantidadPagada(Prestamo.getInstance().getCantidadPagada() + cantidad);
            System.out.println("Pago realizado con exito al Cajero");
        } else {
            next.handle(cantidad);
        }
    }
}
