package demo_1.subject;

import demo_1.observer.Observer;

import java.util.ArrayList;

public class SenderMessage implements Subject{
    private ArrayList<Observer> observers;
    private String text;

    public SenderMessage() {
        observers = new ArrayList<>();
        text="SenderMessage - constructor";
        System.out.println(text);
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
        if(i >= 0)
            observers.remove(i);
    }

    //Самое интересное: опорвещание наблюдателей об изменении состояния
    //через метод update(), реализуемый всеми наблюдателями
    @Override
    public void notifyObservers() {
        for(int i=0; i<observers.size(); i++){
            Observer observer = observers.get(i);
            observer.update(text);
        }
    }

    //Оповещание наблюдателей о появление новых данных
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMessage(String text){
        this.text=text;
        measurementsChanged();
    }

}
