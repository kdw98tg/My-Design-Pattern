package src.strategy.behavior;

import src.strategy.behavior.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("로켓처럼 날고 있어요!");
	}
}
