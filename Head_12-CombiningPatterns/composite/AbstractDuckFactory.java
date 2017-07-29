package composite;

//Абстрактная фабрика
//Мы определяем абстрактную фабрику, которая будет реализовуватся субкласамми для создания разных продуктов
public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
