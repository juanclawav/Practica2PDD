package ej2;

public class CoronelOrderHandler extends AbstractOrderHandler {
    protected boolean canHandleOrder(Order order) {
        return order.getType() == OrderType.DESBLOQUEO_MANIFESTACION;
    }

    protected void doHandleOrder(Order order) {
        System.out.println("La orden de desbloqueo/manifestación ha sido manejada por el coronel.");
    }
}
