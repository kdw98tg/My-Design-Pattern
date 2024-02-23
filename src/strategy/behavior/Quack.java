package src.strategy.behavior;

import src.strategy.behavior.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
