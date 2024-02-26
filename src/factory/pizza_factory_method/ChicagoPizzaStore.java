package src.factory.pizza_factory_method;

import src.factory.Pizzas;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(Pizzas _type) {
        Pizza pizza = null;
        switch (_type) {
            case CHEESE:
                pizza = new ChicagoStyleCheesePizza();
                break;
            case VEGGIE:
                pizza = new ChicagoStyleVeggiePizza();
                break;
            case CLAM:
                pizza = new ChicagoStyleClamPizza();
                break;
            case PEPPERONI:
                pizza = new ChicagoStylePepperoniPizza();
                break;
        }
        return pizza;
    }
}
