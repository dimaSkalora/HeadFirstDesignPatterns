package test_duck.quack;

public class MuteQuack implements QuackBehavoir{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
