package observer;

public class DuckCall implements Quackable {
	Observable observable;

	public DuckCall() {
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
		System.out.println("Kwak");
		//Наблюдатели оповещаются о вызовах quack()
		notifyObservers();
	}

	@Override
	public String toString() {
		return "Duck Call";
	}
}
