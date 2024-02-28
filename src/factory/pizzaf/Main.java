package src.factory.pizzaf;


import src.factory.Pizzas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(Pizzas.CHEESE);
        printPizzaStatus("A",pizza);

        pizza = chicagoStore.orderPizza(Pizzas.CHEESE);
        printPizzaStatus("B",pizza);

        pizza = nyStore.orderPizza(Pizzas.CLAM);
        printPizzaStatus("A",pizza);

        pizza = chicagoStore.orderPizza(Pizzas.CLAM);
        printPizzaStatus("B",pizza);

        pizza = nyStore.orderPizza(Pizzas.PEPPERONI);
        printPizzaStatus("A",pizza);

        pizza = chicagoStore.orderPizza(Pizzas.PEPPERONI);
        printPizzaStatus("B",pizza);

        pizza = nyStore.orderPizza(Pizzas.VEGGIE);
        printPizzaStatus("A",pizza);

        pizza = chicagoStore.orderPizza(Pizzas.VEGGIE);
        printPizzaStatus("B",pizza);
    }

    private static void printPizzaStatus(String name,Pizza pizza){
        System.out.println(name+ " ordered a " + pizza.name + "\n");
        System.out.println(name+ " ordered a " + pizza.dough + "\n");
        System.out.println(name+ " ordered a " + pizza.sauce + "\n");
        System.out.println(name+ " ordered a " + Arrays.toString(pizza.veggies) + "\n");
    }
}
