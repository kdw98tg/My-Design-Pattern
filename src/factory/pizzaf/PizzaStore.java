package src.factory.pizzaf;

import src.factory.Pizzas;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(Pizzas _item);

    public Pizza orderPizza(Pizzas _type){
        Pizza pizza = createPizza(_type);
        System.out.println("--- 만드는 중 " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
