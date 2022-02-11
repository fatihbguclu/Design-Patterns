package main.patterns.observer;

import main.patterns.observer.display.CurrentConditionsDisplay;
import main.patterns.observer.display.ForecastDisplay;
import main.patterns.observer.display.StatisticsDisplay;

public class WeatherStationDriver {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(70,65,30.4f);
        weatherData.setMeasurements(77,70,29.3f);

        weatherData.removeObserver(forecastDisplay);
        System.out.println("Removing ForecastDisplay");
        weatherData.setMeasurements(70,65,30.4f);

        weatherData.removeObserver(statisticsDisplay);
        System.out.println("Removing StatisticsDisplay");
        weatherData.setMeasurements(70,65,30.4f);

        weatherData.removeObserver(currentConditionsDisplay);
        System.out.println("Removing CurrentConditionsDisplay");
        weatherData.setMeasurements(70,65,30.4f);
    }
}
