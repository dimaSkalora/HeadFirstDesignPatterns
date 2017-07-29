package observer;

//Чтобы за Quackable можно было наблюдать, они должны реализовать интерфейс QuackObservable
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
