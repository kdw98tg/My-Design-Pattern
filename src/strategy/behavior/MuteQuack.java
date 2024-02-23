package src.strategy.behavior;

import src.strategy.behavior.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< 조용 >>");
    }
}
