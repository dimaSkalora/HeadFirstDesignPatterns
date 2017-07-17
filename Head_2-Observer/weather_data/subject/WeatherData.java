package weather_data.subject;

import weather_data.observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    //Новые наблюдатели просто добавляются в конец списка
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    //Если наблюдатель хочет отменить регистрацию, мы просто удаляем его из списка
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>=0)
            observers.remove(i);
    }

    //Самое интересное: опорвещание наблюдателей об изменении состояния
    //через метод update(), реализуемый всеми наблюдателями
    @Override
    public void notifyObservers() {
        for(int i=0; i<observers.size(); i++){
            Observer observer = observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    //Оповещание наблюдателей о появление новых данных
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //Другие методы WeatherData
}
