package ej2;

public interface OrderHandler {
    void handleOrder(Order order);
    void setNext(OrderHandler next);
}
