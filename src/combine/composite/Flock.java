package src.combine.composite;

import src.combine.ducks.Quackable;
import src.combine.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//오리 무리 클래스
public class Flock implements Quackable {

    List<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable _duck) {
        quackers.add(_duck);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();

        while (iterator.hasNext()) {
            Quackable quackable = iterator.next();
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(Observer _observer) {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable)iterator.next();
            duck.registerObserver(_observer);
        }
    }
}
