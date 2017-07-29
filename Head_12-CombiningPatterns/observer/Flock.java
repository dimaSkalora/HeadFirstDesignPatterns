package observer;

import java.util.ArrayList;
import java.util.Iterator;

//Компоновщик
//Комбинация должна реализовать тот же интерфейс, что и листовые элементы (Quackable)
public class Flock implements Quackable {
    //Каждая стая(Flock) содержыть ArrayList для хранения реализаций Quackable, входящих в эту стаю
    ArrayList<Quackable> quackables = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quackables.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable)iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }

    public void add(Quackable quackable){
        quackables.add(quackable);
    }

    //Мы перебираем элементы ArrayList и вызываем quack() для каждого элемента
    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackables.iterator();
        while(iterator.hasNext()){
            Quackable quackable = iterator.next();
            quackable.quack();
        }
    }

    public String toString() {
        return "Flock of Ducks";
    }
}
