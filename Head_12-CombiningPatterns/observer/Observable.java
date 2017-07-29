package observer;

import java.util.ArrayList;
import java.util.Iterator;

//Класс реализует всю функциональность, необходимую для наблюдения
public class Observable implements QuackObservable{
    ArrayList<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    //Используется для управления наблюдением
    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    //Регистрация наблюдателя
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    //Оповещание наблюдателя
    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while(iterator.hasNext()){
            Observer observer = iterator.next();
            observer.update(duck);
        }
    }
}
