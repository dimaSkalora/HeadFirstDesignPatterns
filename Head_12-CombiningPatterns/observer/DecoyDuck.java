package observer;

public class DecoyDuck implements Quackable {
	Observable observable;

	public DecoyDuck() {
		this.observable = new Observable(this);
	}

	public void quack() {
		System.out.println("<< Silence >>");
		//Наблюдатели оповещаются о вызовах quack()
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

	@Override
	public String toString() {
		return "Decoy Duck";
	}
}
