package src.factory.pizzas_factory;

public class ClamPizza extends Pizza{
    public ClamPizza() {
        name = "클램 피자";
        dough = "얇은 크러스트";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
