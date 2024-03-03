package src.factory.pizzas_factory;

public class PepperoniPizza extends Pizza{
    public PepperoniPizza() {
        name = "페페로니 Pizza";
        dough = "크러스트";
        sauce = "Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }
}
