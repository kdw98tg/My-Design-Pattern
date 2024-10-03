package src.combine.adapter;

import src.combine.ducks.Quackable;
import src.combine.observer.Observable;
import src.combine.observer.Observer;

public class GooseAdapter implements Quackable {
    private Goose goose = null;
    private Observable observable = null;

    public GooseAdapter(Goose _goose) {
        goose = _goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer _observer) {
        observable.registerObserver(_observer);
    }
}
