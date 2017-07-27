package factory;

//Абстрактная фабрика
public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		//Сначачла создаем фабрику, которая будет передаватся методу simulate()
		AbstractDuckFactory duckFactory = new CountingDuckFactory();

		simulator.simulate(duckFactory);
	}

	//Метод simulate() получаем AbstractDuckFactory и используем фабрику для создания уток
	// (вместо непосредственного создание экземпляров)
	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
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
				QuackCounter.getQuacks() +
				" times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
