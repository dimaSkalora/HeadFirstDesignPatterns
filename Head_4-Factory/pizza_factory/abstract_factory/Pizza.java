package pizza_factory.abstract_factory;

import pizza_factory.abstract_factory.pizza_ingredient.cheese.Cheese;
import pizza_factory.abstract_factory.pizza_ingredient.clams.Clams;
import pizza_factory.abstract_factory.pizza_ingredient.dough.Dough;
import pizza_factory.abstract_factory.pizza_ingredient.pepperoni.Pepperoni;
import pizza_factory.abstract_factory.pizza_ingredient.sauce.Sauce;
import pizza_factory.abstract_factory.pizza_ingredient.veggies.Veggies;

//Полноценная фабрика
public abstract class Pizza {
    //Каждый обьект Pizza содержит название, тип основы, тип соуса и набор добавок
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Clams clams;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;


    //подготовить
    //В нем мы будем собирать ингредиенты, необходимые для приготовления пиццы.
    //Которые разумеется будут производится фабрикой ингедиентов.
    public abstract void prepare();

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

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clams != null) {
            result.append(clams);
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }

}
