package test_duck;

import test_duck.fly.FlyBehavior;
import test_duck.quack.QuackBehavoir;

public abstract class Duck {
    //Обьявляем две ссылочные переменные с типами интерфейсов поведения.
    //Переменные наследуются всеми субклассами Duck
    FlyBehavior flyBehavior;
    QuackBehavoir quackBehavoir;

    public Duck() {
    }

    public abstract void display();

    //Делегирование операции классами поведения
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavoir.quack();
    }

    //Вызывая эти методы в любой момент, мы можем изменить поведение утки "на лету"
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavoir(QuackBehavoir quackBehavoir) {
        this.quackBehavoir = quackBehavoir;
    }

    public void swim(){
        System.out.println("All duck float, even decoys!");
    }
}
