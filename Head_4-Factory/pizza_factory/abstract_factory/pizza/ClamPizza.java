package pizza_factory.abstract_factory.pizza;

import pizza_factory.abstract_factory.Pizza;
import pizza_factory.abstract_factory.pizza_ingredient.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    //В ходе приготовления пиццы нам понадобится фабрика, поставляющая ингредиенты.
    //Сщщтвественно конструктору каждого класса пиццы переждается обьект фабрики,
    //ссылка на который сохраняется в переменной.
    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }
}
