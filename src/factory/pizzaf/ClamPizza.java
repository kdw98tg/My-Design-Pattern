package src.factory.pizzaf;

public class ClamPizza extends Pizza{

    private PizzaIngredientFactory ingredientFactory = null;

    public ClamPizza(PizzaIngredientFactory _ingredientFactory){
        this.ingredientFactory = _ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("준비중" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
