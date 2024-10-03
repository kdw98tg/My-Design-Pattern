package src.combine.observer;

public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable _duck) {
        System.out.println("꽥꽥 학자: "+ _duck + "가 방금 소리를 냄");
    }
}
