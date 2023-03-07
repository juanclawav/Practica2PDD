package ej2;

public class Order {
    private OrderType type;

    public Order(OrderType type) {
        this.type = type;
    }

    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }
}


