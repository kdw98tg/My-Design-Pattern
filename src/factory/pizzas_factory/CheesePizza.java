package src.factory.pizzas_factory;

public class CheesePizza extends Pizza{
    public CheesePizza() {
        name = "치즈 피자";
        dough = "보통 크러스트";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
