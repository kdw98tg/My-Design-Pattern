package src.factory.pizzaf;

public class CheesePizza extends Pizza{

    PizzaIngredientFactory ingredientFactory = null;

    public CheesePizza(PizzaIngredientFactory _ingredientFactory){
        this.ingredientFactory = _ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("준비중"+ name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
