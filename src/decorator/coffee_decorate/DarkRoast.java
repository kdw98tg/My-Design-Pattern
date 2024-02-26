package src.decorator.coffee_decorate;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "다크 로스팅된 커피";
    }

    @Override
    public double cost() {
        return 3.5;
    }
}
