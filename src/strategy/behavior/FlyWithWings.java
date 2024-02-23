package src.strategy.behavior;

import src.strategy.behavior.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날고 있어요!");
    }
}
