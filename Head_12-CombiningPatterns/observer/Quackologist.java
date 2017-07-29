package observer;

//Наблюдатель должен реализовать интерфейс Observer, иначе его не удастся зарегистрировать с QuackObservable
public class Quackologist implements Observer{

    //Выводит информацию о реализации Observable, от которой поступило оповещание
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: "+duck+" just quacked.");
    }
    public String toString() {
        return "Quackologist";
    }
}
