package src.observer.pull_weather;

public interface Observer {

    //옵저버들이 가질 update 메소드
    //온도, 습도, 기압 정보를 update
    public void update();

}
