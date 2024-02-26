package src.factory.pizza_factory_method;

import src.factory.Pizzas;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(Pizzas _type) {
        Pizza pizza = null;
        switch (_type) {
            case CHEESE:
                pizza = new NYStyleCheesePizza();
            break;
            case VEGGIE:
                pizza = new NYStyleVeggiePizza();
            break;
            case CLAM:
                pizza = new NYStyleClamPizza();
            break;
            case PEPPERONI:
                pizza = new NYStylePepperoniPizza();
            break;
        }
        return pizza;
    }
}
