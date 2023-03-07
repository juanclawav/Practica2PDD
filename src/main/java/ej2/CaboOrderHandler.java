package ej2;

public class CaboOrderHandler extends AbstractOrderHandler {
    protected boolean canHandleOrder(Order order) {
        return order.getType() == OrderType.LIMPIEZA;
    }

    protected void doHandleOrder(Order order) {
        System.out.println("La orden de limpieza ha sido manejada por el cabo.");
    }
}