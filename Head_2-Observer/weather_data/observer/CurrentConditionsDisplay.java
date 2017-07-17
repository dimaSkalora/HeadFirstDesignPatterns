package weather_data.observer;

import weather_data.subject.Subject;

//Элемент реализует Obsever, что бы получить данные от обьекта WeatherData
//Также он реализует интерфейс DisplayElement как и все визуальные элементы в нашем API
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    //Конструктору передается обьект WeatherData, который используется для
    //регистрации элемента в качестве наблюдателя
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    //Метод display() просто выводит текущее значения температуры и влажности
    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");
    }

    //При вызове update() мы сохраняем значение температуры и влажности, после чего вызываем display()
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }
}
