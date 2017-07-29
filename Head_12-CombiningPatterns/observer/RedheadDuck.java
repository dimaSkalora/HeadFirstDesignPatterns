package observer;

public class RedheadDuck implements Quackable {
	Observable observable;

	public RedheadDuck() {
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
		return "Redhead Duck";
	}
}
