package ej2;

public abstract class AbstractOrderHandler implements OrderHandler {
    protected OrderHandler nextHandler;

    public void setNext(OrderHandler next) {
        this.nextHandler = next;
    }

    public void handleOrder(Order order) {
        if (this.canHandleOrder(order)) {
            this.doHandleOrder(order);
        } else if (this.nextHandler != null) {
            this.nextHandler.handleOrder(order);
        } else {
            System.out.println("No se puede manejar la orden.");
        }
    }

    protected abstract boolean canHandleOrder(Order order);
    protected abstract void doHandleOrder(Order order);
}
