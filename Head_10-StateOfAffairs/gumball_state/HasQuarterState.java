package gumball_state;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	//Некорректное действия для этого состояния
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	//Вернут монетку и перейти в состояние NoQuarterState
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	//Когда покупатель дергает за рычаг, автомат переводится в состояние SoldState
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

	//Некорректное действия для этого состояния
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
