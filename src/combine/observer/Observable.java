package src.combine.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable {

    private List<Observer> observerList = new ArrayList<Observer>();
    private QuackObservable duck = null;

    public Observable(QuackObservable _duck) {
        this.duck = _duck;
    }

    @Override
    public void registerObserver(Observer _observer) {
        observerList.add(_observer);
    }

    public void notifyObservers(){
        Iterator<Observer> iterator = observerList.iterator();
        while(iterator.hasNext()){
            Observer observer = iterator.next();
            observer.update(duck);
        }
    }

}
