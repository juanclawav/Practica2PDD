package ej2;

public class TenienteOrderHandler extends AbstractOrderHandler {
    protected boolean canHandleOrder(Order order) {
        return order.getType() == OrderType.DISCIPLINA;
    }

    protected void doHandleOrder(Order order) {
        System.out.println("La orden de disciplina ha sido manejada por el teniente.");
    }
}
