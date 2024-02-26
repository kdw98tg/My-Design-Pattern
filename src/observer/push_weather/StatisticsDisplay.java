package src.observer.push_weather;

public class StatisticsDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData _weatherData){
        weatherData = _weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("온도" + this.temperature + "습도" + this.humidity + "기압" + this.pressure);
    }

    @Override
    public void update(float _temp, float _humidity, float _pressure) {
        this.temperature = _temp;
        this.humidity = _humidity;
        this.pressure = _pressure;
        display();
    }
}
