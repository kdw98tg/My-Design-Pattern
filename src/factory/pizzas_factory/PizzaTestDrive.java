package src.factory.pizzas_factory;

import src.factory.Pizzas;

public class PizzaTestDrive {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza(Pizzas.CHEESE);
        System.out.println(pizza.getName() + "을 주문 함" + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza(Pizzas.VEGGIE);
        System.out.println(pizza.getName() + "을 주문 함" + "\n");
        System.out.println(pizza);
    }
}
