package src.factory.pizzas_factory;

import src.factory.Pizzas;

public class SimplePizzaFactory {
    public Pizza createPizza(Pizzas _type) {
        Pizza pizza = null;
        switch (_type) {
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza();
                break;
            case CLAM:
                pizza = new ClamPizza();
                break;
            case VEGGIE:
                pizza = new VeggiePizza();
                break;
        }
        return pizza;
    }


}
