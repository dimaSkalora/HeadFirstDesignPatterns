package observer;

//Декоратор
public class QuackCounter implements Quackable {
    //Переменная для хранения декорируемого обьекта
    Quackable duck;
    //Для подсчета всех кряков используется статическая переменная
    static int numberOfQuacks;

    Observable observable;
    public QuackCounter(Quackable duck) {
        this.duck = duck;
        this.observable = new Observable(this);
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
        notifyObservers();
    }

    //Декоратор дополняется статическим методом, который возврящает колическтво кряков во всех реалицация Quackable
    public static int getQuacks(){
        return numberOfQuacks;
    }
}
