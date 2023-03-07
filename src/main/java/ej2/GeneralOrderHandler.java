package ej2;

public class GeneralOrderHandler extends AbstractOrderHandler {
    protected boolean canHandleOrder(Order order) {
        return order.getType() == OrderType.ENTREVISTA;
    }

    protected void doHandleOrder(Order order) {
        System.out.println("La orden de entrevista ha sido manejada por el general.");
    }
}
