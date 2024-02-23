package src.strategy;

import src.strategy.behavior.FlyRocketPowered;
import src.strategy.duck.Duck;
import src.strategy.duck.MallardDuck;
import src.strategy.duck.ModelDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("\n");

        Duck modelDuck  = new ModelDuck();
        modelDuck.display();
        //생성자로 넣으면 행동을 동적으로 정의할 수 있음
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performQuack();
        modelDuck.performFly();
    }
}
