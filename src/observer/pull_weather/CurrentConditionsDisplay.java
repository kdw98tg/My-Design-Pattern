package src.observer.pull_weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData _weatherData){
        this.weatherData = _weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
    @Override
    public void display() {
        System.out.println("현재 상태 : 온도: "+temperature+"F, 습도: "+humidity+"%");
    }

}
