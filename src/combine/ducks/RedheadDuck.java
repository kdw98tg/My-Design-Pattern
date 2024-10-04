package src.combine.ducks;

import org.w3c.dom.ls.LSOutput;
import src.combine.observer.Observable;
import src.combine.observer.Observer;

public class RedheadDuck implements Quackable {
    private Observable observable = null;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("--꽥--");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
