package test_duck;

import test_duck.fly.FlyWithWings;
import test_duck.quack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        //MallardDuck использует класс Quack для выполнения действия, так что при вызове performQuack()
        //отвественость за выполнения возглагается на обьект Quack
        quackBehavoir = new Quack();
        //А в качестве реализации FlyBehavior используется тип FlyWithWings
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
