package decorator;

//Декоратор
public class QuackCounter implements Quackable{
    //Переменная для хранения декорируемого обьекта
    Quackable duck;
    //Для подсчета всех кряков используется статическая переменная
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    //Декоратор дополняется статическим методом, который возврящает колическтво кряков во всех реалицация Quackable
    public static int getQuacks(){
        return numberOfQuacks;
    }
}
