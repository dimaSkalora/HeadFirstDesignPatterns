package pizza_factory.abstract_factory.pizza_ingredient;

import pizza_factory.abstract_factory.pizza_ingredient.cheese.Cheese;
import pizza_factory.abstract_factory.pizza_ingredient.cheese.ReggianoCheese;
import pizza_factory.abstract_factory.pizza_ingredient.clams.Clams;
import pizza_factory.abstract_factory.pizza_ingredient.clams.FreshClams;
import pizza_factory.abstract_factory.pizza_ingredient.dough.Dough;
import pizza_factory.abstract_factory.pizza_ingredient.dough.ThinCrustDough;
import pizza_factory.abstract_factory.pizza_ingredient.pepperoni.Pepperoni;
import pizza_factory.abstract_factory.pizza_ingredient.pepperoni.SlicedPepperoni;
import pizza_factory.abstract_factory.pizza_ingredient.sauce.MarinaraSauce;
import pizza_factory.abstract_factory.pizza_ingredient.sauce.Sauce;
import pizza_factory.abstract_factory.pizza_ingredient.veggies.*;

//Рефлизация фабрикик ингредиентов для Нью-Йорка.
//Эта фабрика специализируется на соусе "маринара", сыре "реджиано" и свежых мидиях...
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Carlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    //Нарезанные паперони используются и в Нью-Йорке и в Чикаго
    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
