package src.strategy.duck;

import src.strategy.behavior.FlyNoWay;
import src.strategy.behavior.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("모형 오리 입니다.");
    }
}
