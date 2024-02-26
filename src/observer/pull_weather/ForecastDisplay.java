package src.observer.pull_weather;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.9f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData _weatherData){
        this.weatherData = _weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("날씨가 좋아지고 있습니다");
        } else if (currentPressure == lastPressure) {
            System.out.println("날씨가 지속되고 있습니다");
        } else if (currentPressure < lastPressure) {
            System.out.println("추워지고 비가올 수 있음을 대비하세요");
        }
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }
}
