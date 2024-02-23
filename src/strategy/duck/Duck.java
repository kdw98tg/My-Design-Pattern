package src.strategy.duck;

import src.strategy.behavior.interfaces.FlyBehavior;
import src.strategy.behavior.interfaces.QuackBehavior;

public abstract class Duck {

    //행동의 인터페이스 구현
    FlyBehavior flyBehavior = null;
    QuackBehavior quackBehavior = null;

    public void setFlyBehavior(FlyBehavior _flyBehavior){
        flyBehavior = _flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior _quackBehavior){
        quackBehavior = _quackBehavior;
    }

    //오리의 행동을 출력할 추상함수
    public abstract void display();

    //나는 행동 실행부
    public void performFly(){
        flyBehavior.fly();
    }
    
    //우는 행동 실행부
    public void performQuack(){
        quackBehavior.quack();
    }
    
    //재구현할 필요 없는 메서드
    public void swim(){
        System.out.println("모든 오리는 물에 뜸");
    }
    
}
