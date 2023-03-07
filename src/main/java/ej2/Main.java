package ej2;

public class Main {
    public static void main(String[] args) {
        OrderHandler general = new GeneralOrderHandler();
        OrderHandler teniente = new TenienteOrderHandler();
        OrderHandler coronel = new CoronelOrderHandler();
        OrderHandler cabo = new CaboOrderHandler();

        general.setNext(teniente);
        teniente.setNext(coronel);
        coronel.setNext(cabo);

        Order entrevista = new Order(OrderType.valueOf("ENTREVISTA"));
        Order disciplina = new Order(OrderType.valueOf("DISCIPLINA"));
        Order desbloqueo = new Order(OrderType.valueOf("DESBLOQUEO_MANIFESTACION"));
        Order limpieza = new Order(OrderType.valueOf("LIMPIEZA"));

        general.handleOrder(entrevista);
        general.handleOrder(disciplina);
        general.handleOrder(desbloqueo);
        general.handleOrder(limpieza);
    }
}
