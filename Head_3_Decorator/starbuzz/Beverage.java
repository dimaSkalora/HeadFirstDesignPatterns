package starbuzz;

//Beverage(Напиток) - абстрактный класс с двумя тметодлами: getDescription() и cost()
public abstract class Beverage {
    protected String description = "Unknown Beverage";
    protected static final int TALL = 10;
    protected static final int GRANDE = 15;
    protected static final int VENTI = 20;
    protected int size;

    //Размер стаканчика
    public int getSize(){
        return size;
    }

    //Описание
    public String getDescription() {
        return description;
    }

    //Стоимость
    public abstract double cost();
}
