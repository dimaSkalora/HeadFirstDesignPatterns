package demo_1.subject;

import demo_1.observer.Observer;

public interface Subject {
    //Оба метода получают в аргументе реализациюObserver(Регистрируемый или исключаемый наблюдатель)
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    //Этот метод вызывается для оповещания наблюдателей об изменении состояния субьекта
    void notifyObservers();
}
