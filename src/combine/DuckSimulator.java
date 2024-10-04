package src.combine;

import src.combine.adapter.Goose;
import src.combine.adapter.GooseAdapter;
import src.combine.composite.Flock;
import src.combine.decorator.QuackCounter;
import src.combine.ducks.*;
import src.combine.factory.AbstractDuckFactory;
import src.combine.factory.CountingDuckFactory;
import src.combine.observer.Quackologist;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory factory = new CountingDuckFactory();
        simulator.simulate(factory);
    }

    void simulate(AbstractDuckFactory _countingDuckFactory) {

        Quackable mallardDuck = _countingDuckFactory.createMallardDuck();
        Quackable redheadDuck = _countingDuckFactory.createRedheadDuck();
        Quackable duckCall = _countingDuckFactory.createDuckCall();
        Quackable rubberDuck = _countingDuckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());//거위는 Counter 에서 제외

        System.out.println("\n Duck Simulator");

        //전체 오리들 관리하는 컴포지트
        Flock flocks = new Flock();
        flocks.add(redheadDuck);
        flocks.add(duckCall);
        flocks.add(rubberDuck);
        flocks.add(goose);


        //진짜 오리들 관리하는 컴포지트
        Flock realDuck = new Flock();

        Quackable mallardDuck1 =  _countingDuckFactory.createMallardDuck();
        Quackable mallardDuck2 =  _countingDuckFactory.createMallardDuck();
        Quackable mallardDuck3 =  _countingDuckFactory.createMallardDuck();
        Quackable mallardDuck4 =  _countingDuckFactory.createMallardDuck();
        Quackable mallardDuck5 =  _countingDuckFactory.createMallardDuck();

        realDuck.add(mallardDuck);
        realDuck.add(mallardDuck1);
        realDuck.add(mallardDuck2);
        realDuck.add(mallardDuck3);
        realDuck.add(mallardDuck4);
        realDuck.add(mallardDuck5);

        flocks.add(realDuck);//전체 오리 리스트에 진짜 오리 리스트 추가


        Quackologist quackologist = new Quackologist();
        flocks.registerObserver(quackologist);

        simulate(flocks);

        System.out.println("오리가 소리를 낸 횟수 : " + QuackCounter.getQuacksCount() + " 번");

    }

    void simulate(Quackable _quackableDuck) {
        _quackableDuck.quack();
    }
}
