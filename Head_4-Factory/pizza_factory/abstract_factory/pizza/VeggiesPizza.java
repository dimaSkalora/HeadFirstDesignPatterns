package pizza_factory.abstract_factory.pizza;

import pizza_factory.abstract_factory.Pizza;
import pizza_factory.abstract_factory.pizza_ingredient.PizzaIngredientFactory;

public class VeggiesPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    //В ходе приготовления пиццы нам понадобится фабрика, поставляющая ингредиенты.
    //Сщщтвественно конструктору каждого класса пиццы переждается обьект фабрики,
    //ссылка на который сохраняется в переменной.

    public VeggiesPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
