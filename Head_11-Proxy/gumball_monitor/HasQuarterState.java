package gumball_monitor;

import java.util.Random;

public class HasQuarterState implements State {
	//Сообщаем JVM что это поле не сериализуется
	transient GumballMachine gumballMachine;
	//Добавляем генератор случайных чисел с 10% - вераятностью выгрыша
	Random randomWinner = new Random(System.currentTimeMillis());
 
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
		//Проверяем повезло ли покупателю
		int winner = randomWinner.nextInt(10);
		if((winner == 0) && (gumballMachine.getCount()>1))
			gumballMachine.setState(gumballMachine.getWinnerState());
		else
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
