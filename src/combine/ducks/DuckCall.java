package src.combine.ducks;

import src.combine.observer.Observable;
import src.combine.observer.Observer;

public class DuckCall implements Quackable{
    private Observable observable = null;
    public DuckCall() {
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("--꾸악--");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
