package src.observer.pull_weather;

import src.observer.push_weather.CurrentConditionsDisplay;
import src.observer.push_weather.HeatIndexDisplay;
import src.observer.push_weather.StatisticsDisplay;
import src.observer.push_weather.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80f,65f,30.45f);
    }
}
