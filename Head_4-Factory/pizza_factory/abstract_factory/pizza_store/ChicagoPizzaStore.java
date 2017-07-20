package pizza_factory.abstract_factory.pizza_store;


import pizza_factory.abstract_factory.Pizza;
import pizza_factory.abstract_factory.pizza.CheesePizza;
import pizza_factory.abstract_factory.pizza.ClamPizza;
import pizza_factory.abstract_factory.pizza.PepperoniPizza;
import pizza_factory.abstract_factory.pizza.VeggiesPizza;
import pizza_factory.abstract_factory.pizza_ingredient.ChicagoPizzaIngredientFactory;
import pizza_factory.abstract_factory.pizza_ingredient.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiesPizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");

        }
        return pizza;
    }


}
