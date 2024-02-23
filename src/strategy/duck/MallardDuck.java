package src.strategy.duck;

import src.strategy.behavior.FlyWithWings;
import src.strategy.behavior.Quack;
import src.strategy.behavior.interfaces.FlyBehavior;
import src.strategy.behavior.interfaces.QuackBehavior;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리 입니다.");
    }
}
