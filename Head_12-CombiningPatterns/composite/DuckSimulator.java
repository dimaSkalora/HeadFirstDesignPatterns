package composite;

//Компоновщик
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
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		//Гуссиные крики учоных не интересуют, поэтому обьекты Goose не декорируются
		//Первращения гуся в утку с помощу адаптера
		Quackable gooseDuck = new GooseAdapter(new Goose());

		//Вывод данных созданых для утковедов
		System.out.println("\nDuck Simulator: With Composite - Flocks");

		Flock flockDucks = new Flock();

		flockDucks.add(redheadDuck);
		flockDucks.add(duckCall);
		flockDucks.add(rubberDuck);
		flockDucks.add(gooseDuck);

		//Затем создаем новый обьект Flock, предназначеный только для кряков (MallardDuck)
		Flock flockOfMallards = new Flock();
		//Создаем несколько обьектов
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();
		//и добавляем их в контейнер Flock
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);
		//А тепер стая кряков добавляем в основную стаю
		flockDucks.add(flockOfMallards);

		System.out.println("\nDuck Simulator: Wole Flock Simulation");
		//Сначала тестируем всю стаю
		simulate(flockDucks);
		System.out.println("\nDuck Simulator: Mallard Flock Simulation");
		//А тепер  - только стаю кряков
		simulate(flockOfMallards);

		System.out.println("The ducks quacked " +
				QuackCounter.getQuacks() +
				" times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
