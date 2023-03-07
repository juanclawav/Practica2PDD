package ej7SingletonChainOfResponsibility;

public class EncargadoPrestamos implements IAgentePago {
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

        if (Prestamo.getInstance().getCantidadPagada() >= Prestamo.getInstance().getCantidadOriginal() * 50 / 100) {
            System.out.println("Gracias por la confianza le entregamos sus documentos.");

        } else {
            System.out.println("Verifique la entrada!");
        }
    }

}
