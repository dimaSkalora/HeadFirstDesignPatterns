package test_duck;

import test_duck.fly.FlyNoWay;
import test_duck.quack.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        //Утка-приманка летать не умеет...
        flyBehavior = new FlyNoWay();
        quackBehavoir = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
