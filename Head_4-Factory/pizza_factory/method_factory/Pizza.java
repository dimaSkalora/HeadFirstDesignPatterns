package pizza_factory.method_factory;

import java.util.ArrayList;

public abstract class Pizza {
    //Каждый обьект Pizza содержит название, тип основы, тип соуса и набор добавок
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<>();

    //подготовить
    public void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for(int i=0; i<toppings.size(); i++)
            System.out.println("   "+toppings.get(i));
    }

    //выпекать
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    //порез
    public void cut() {
        System.out.println("Cutting the pizza into diaganal slices");
    }

    //коробка
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
