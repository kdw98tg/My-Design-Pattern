package src.factory.pizza_factory_method;

import src.factory.Pizzas;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza(Pizzas.CHEESE);
        System.out.println("에단이 주문한" + pizza.getName());

        System.out.println("\n");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        pizza = chicagoPizzaStore.orderPizza(Pizzas.CHEESE);
        System.out.println("에단이 주문한" + pizza.getName());
    }
}
