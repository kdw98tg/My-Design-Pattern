package src.observer.pull_weather;

import java.util.ArrayList;
import java.util.List;

//Weather 정보를 관리하는 주제 클래스
public class WeatherData implements Subject {

    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observerList = new ArrayList<Observer>();
    }


    @Override
    public void registerObserver(Observer _observer) {
        observerList.add(_observer);
    }

    @Override
    public void removeObserver(Observer _observer) {
        observerList.remove(_observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList){
            observer.update();
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float _temperature, float _humidity, float _pressure){
        this.temperature = _temperature;
        this.humidity = _humidity;
        this.pressure = _pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
