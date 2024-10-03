package src.combine.decorator;

import src.combine.ducks.Quackable;
import src.combine.observer.Observer;

//타깃 인터페이스 구현
public class QuackCounter implements Quackable {
    private Quackable duck = null;
    private static int numberOfQuacks = 0;//모든 오리가 낸 소리를 세기 위해 static 으로 선언

    public QuackCounter(Quackable _duck){
        this.duck = _duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacksCount(){
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer _observer) {
        duck.registerObserver(_observer);
    }
}
