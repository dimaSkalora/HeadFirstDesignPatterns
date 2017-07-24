package gumball;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        //Загружаем 5 шариков
        GumballMachine gumballMachine = new GumballMachine(5);
        //Выводим состояние автомата
        System.out.println(gumballMachine);

        //Бросаем монетку
        gumballMachine.insertQuarter();
        //Дергаем за рычаг, автомат должен выдать шарик
        gumballMachine.turnCrank();

        //Снова выводим состояние автомата
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        //Требуем монетку обратно
        gumballMachine.ejectQuarter();
        //Автомат не должен выдавать шарик
        gumballMachine.turnCrank();

        //Выводим состояние автомата
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }

}
