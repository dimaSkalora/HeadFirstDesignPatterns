package gumball_state_winner;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    //Если в автомат брошена монетка, вывести сообщение и перейти в состояние HasQuarterState
    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    //Что бы вернут монетку, нужно ее сначало бросить!
    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    //Нет монеткеи нет шарика
    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    //Шарик выдается только за монетку
    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
