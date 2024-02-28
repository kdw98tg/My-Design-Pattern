package src.factory.pizzaf;

import src.factory.Pizzas;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(Pizzas _item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (_item) {
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("시카고 스타일 치즈 피자");
                break;
            case VEGGIE:
                pizza= new VeggiePizza(ingredientFactory);
                pizza.setName("시카고 스타일 야채 피자");
                break;
            case CLAM:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("시카고 스타일 조개 피자");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("시카고 스타일 페퍼로니 피자");
                break;
        }
        return pizza;
    }
}

