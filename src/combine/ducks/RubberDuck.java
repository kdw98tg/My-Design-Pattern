package src.combine.ducks;

import src.combine.observer.Observable;
import src.combine.observer.Observer;

public class RubberDuck implements Quackable{

    Observable observable;
    public RubberDuck() {
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("--삑삑--");
        notifyObservers();
    }
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
