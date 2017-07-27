package decorator;

//Адаптер реализует целевой интерфес, которым в дамнном случии является Quackable
//Первращения гуся в утку с помощу адаптера
public class GooseAdapter implements Quackable {
	Goose goose;
 
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}
 
	public void quack() {
		goose.honk();
	}

	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
