package observer;

//Адаптер реализует целевой интерфес, которым в дамнном случии является Quackable
//Первращения гуся в утку с помощу адаптера
public class GooseAdapter implements Quackable {
	Goose goose;
	Observable observable;

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		this.observable = new Observable(this);
	}
 
	public void quack() {
		goose.honk();
		notifyObservers();
	}

	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
