package decorator;

//Декоратор
//Подсщот кряков уток
public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		//Гуссиные крики учоных не интересуют, поэтому обьекты Goose не декорируются
		//Первращения гуся в утку с помощу адаптера
		Quackable gooseDuck = new GooseAdapter(new Goose());

		//Вывод данных созданых для утковедов
		System.out.println("\nDuck Simulator: With Decorator");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		//Первращения гуся в утку с помощу адаптера
		simulate(gooseDuck);

		System.out.println("The ducks quacked " +
				QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}

}
