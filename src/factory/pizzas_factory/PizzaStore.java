package src.factory.pizzas_factory;

import src.factory.Pizzas;

public class PizzaStore {
    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory _factory){
        this.factory = _factory;
    }

    public Pizza orderPizza(Pizzas _type){
        Pizza pizza;

        pizza = factory.createPizza(_type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
