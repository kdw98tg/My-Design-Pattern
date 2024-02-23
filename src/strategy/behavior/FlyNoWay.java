package src.strategy.behavior;

import src.strategy.behavior.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날지 못함");
    }
}
