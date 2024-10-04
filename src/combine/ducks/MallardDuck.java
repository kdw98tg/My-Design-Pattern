package src.combine.ducks;

import src.combine.observer.Observable;
import src.combine.observer.Observer;


public class MallardDuck implements Quackable {
    private Observable observable = null;

    public MallardDuck() {
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("--꽥--");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer _observer) {
        observable.registerObserver(_observer);
    }

    public void notifyObservers(){
        observable.notifyObservers();
    }
}
