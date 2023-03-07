package ej7SingletonChainOfResponsibility;

public class AgenteCredito implements IAgentePago {
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

        if (Prestamo.getInstance().getCantidadPagada() < (Prestamo.getInstance().getCantidadOriginal() * 50) / 100) {
            Prestamo.getInstance().setCantidadPagada(Prestamo.getInstance().getCantidadPagada() + cantidad);
            System.out.println("Pago realizado con exito al Agente de credito, Desea refinanciar su prestamo??");

        } else {
            next.handle(cantidad);
        }
    }
}
