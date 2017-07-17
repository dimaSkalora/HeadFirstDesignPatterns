package test_duck.fly;

//Реализация поведения для уток, которые умеют летать...
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
