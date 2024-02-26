package src.factory.pizza_factory_method;

import src.factory.Pizzas;

public abstract class PizzaStore {
    public Pizza orderPizza(Pizzas _type){
        Pizza pizza;
        pizza = createPizza(_type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    //팩토리 객체 대신 이 메소드를 사용함
    protected abstract Pizza createPizza(Pizzas _type);

}
