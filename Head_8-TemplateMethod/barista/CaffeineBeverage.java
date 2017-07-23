package barista;

public abstract class CaffeineBeverage {

	//Шаблонный метод. Потомучто он служит шаблоном для алгоритма
	// в данном случии приготовлние напитков
	//В шаблоне каждый шаг алгоритма представлен некоторым методом
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
 
	abstract void brew();
  
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("Boiling water");
	}
  
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
