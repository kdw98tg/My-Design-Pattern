package src.decorator.coffee_decorate;

public abstract class CondimentDecorator extends Beverage//Beverage가 들어갈 자리에 들어갈 수 있도록 상속받음
{
    //각 데코레이터가 감쌀 음료를 나타내는 Beverage 객체를 여기에 지정
    Beverage beverage;
    
    //모든 첨가물에서 getDescription 메소드를 재구현
    public abstract String getDescription();
    public Size getSize(){return beverage.getSize();}
}
