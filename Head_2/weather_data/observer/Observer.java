package weather_data.observer;

//Интерфейс Observer реализуется всеми наблюдателями, таким образом,
//все наблюдатели должны реализовать метод update()
public interface Observer {
    //Данные состояния, передаваемые наблюдателям при изменени состояния субьекта
    void update(float temp, float humidity, float pressure);
}
