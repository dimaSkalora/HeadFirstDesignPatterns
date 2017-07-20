package pizza_factory.abstract_factory.pizza_ingredient;

import pizza_factory.abstract_factory.pizza_ingredient.cheese.Cheese;
import pizza_factory.abstract_factory.pizza_ingredient.clams.Clams;
import pizza_factory.abstract_factory.pizza_ingredient.dough.Dough;
import pizza_factory.abstract_factory.pizza_ingredient.pepperoni.Pepperoni;
import pizza_factory.abstract_factory.pizza_ingredient.sauce.Sauce;
import pizza_factory.abstract_factory.pizza_ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {
    //Для каждого ингредиента в интерфейсе определяется метод create
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
