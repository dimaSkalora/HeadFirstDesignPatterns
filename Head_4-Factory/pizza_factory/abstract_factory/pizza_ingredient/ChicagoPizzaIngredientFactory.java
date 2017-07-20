package pizza_factory.abstract_factory.pizza_ingredient;

import pizza_factory.abstract_factory.pizza_ingredient.cheese.Cheese;
import pizza_factory.abstract_factory.pizza_ingredient.clams.Clams;
import pizza_factory.abstract_factory.pizza_ingredient.clams.ForzenClams;
import pizza_factory.abstract_factory.pizza_ingredient.dough.Dough;
import pizza_factory.abstract_factory.pizza_ingredient.dough.TrickCrustDough;
import pizza_factory.abstract_factory.pizza_ingredient.pepperoni.Pepperoni;
import pizza_factory.abstract_factory.pizza_ingredient.pepperoni.SlicedPepperoni;
import pizza_factory.abstract_factory.pizza_ingredient.sauce.PlumTomatoSauce;
import pizza_factory.abstract_factory.pizza_ingredient.sauce.Sauce;
import pizza_factory.abstract_factory.pizza_ingredient.veggies.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new TrickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Spinach(), new EggPlant(), new BlackOlives(), new Mozzarella()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new ForzenClams();
    }
}
