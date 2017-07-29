package observer;

public class MallardDuck implements Quackable {
	Observable observable;

	public MallardDuck() {
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
		System.out.println("Quack");
		notifyObservers();
	}

	@Override
	public String toString() {
		return "Mallard Duck";
	}
}
