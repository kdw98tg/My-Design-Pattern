package src.factory.pizzas_factory;

public class VeggiePizza extends Pizza{
    public VeggiePizza() {
        name = "베기 피자";
        dough = "크러스트";
        sauce = "Marinara sauce";
        toppings.add("Shredded mozzarella");
        toppings.add("Grated parmesan");
        toppings.add("Diced onion");
        toppings.add("Sliced mushrooms");
        toppings.add("Sliced red pepper");
        toppings.add("Sliced black olives");
    }
}
