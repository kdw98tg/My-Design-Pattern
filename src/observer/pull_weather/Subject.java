package src.observer.pull_weather;

public interface Subject {

    //옵저버 등록
    public void registerObserver(Observer _observer);

    //옵저버 제거
    public void removeObserver(Observer _observer);

    //옵저버에게 정보가 변경됨을 알리기
    public void notifyObservers();
}
