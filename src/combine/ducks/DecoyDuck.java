package src.combine.ducks;

import src.combine.observer.Observable;
import src.combine.observer.Observer;

public class DecoyDuck implements Quackable {
    private Observable observable = null;

    public DecoyDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("--조용--");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
