package src.decorator.coffee_decorate;

public class Whip extends CondimentDecorator{

    public Whip (Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + .50;

    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }
}
