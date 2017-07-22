package adapter.duck;

public class DuckTestDrive {
	public static void main(String[] args) {
		//Создаем обьект Duck
		MallardDuck duck = new MallardDuck();
 		//Создаем обьект Turkey
		WildTurkey turkey = new WildTurkey();
		//Затем Turkey упаковуется в TurkeyAdapter и начинает выглядеть как Duck
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		//Тестируем методы Turkey
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();

		//Тепер вызываем метод testDuck() который получает обьект Duck
		System.out.println("\nThe Duck says...");
		testDuck(duck);

		//Важный тест: выдаем Turkey за Duck
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}

	//Метод получает обьект Duck и вызывает его методы quack() и fly()
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
