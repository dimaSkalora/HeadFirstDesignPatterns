package weather_data;

import weather_data.observer.CurrentConditionsDisplay;
import weather_data.observer.ForecastDisplay;
import weather_data.observer.StatisticsDisplay;
import weather_data.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        //Создаем три визуфльных элемента, передавая им обьект WeatherData
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        //StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        //ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        //Имитация новых погодных данных
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.9f);
        weatherData.setMeasurements(78,90,29.2f);
    }
}
