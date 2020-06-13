package simplePrototype;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    public PizzaOrder prepareOrder() {
        List availablePizzas = new ArrayList();
        availablePizzas.add("Hawai");
        availablePizzas.add("Capriciosa");
        availablePizzas.add("Margherita");
        availablePizzas.add("Pepperoni");
        return new PizzaOrder(availablePizzas);
    }

}
