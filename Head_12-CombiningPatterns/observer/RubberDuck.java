package observer;

public class RubberDuck implements Quackable {
	Observable observable;

	public RubberDuck() {
		this.observable = new Observable(this);
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}

	@Override
	public String toString() {
		return "Rubber Duck";
	}
}
