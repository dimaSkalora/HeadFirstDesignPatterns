package test_duck.fly;

//Реализация поведения для уток, которые не летают(например, резиновых)
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
