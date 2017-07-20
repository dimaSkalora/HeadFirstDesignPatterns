package pizza_factory.abstract_factory.pizza_store;

import pizza_factory.abstract_factory.pizza.CheesePizza;
import pizza_factory.abstract_factory.Pizza;
import pizza_factory.abstract_factory.pizza.ClamPizza;
import pizza_factory.abstract_factory.pizza.PepperoniPizza;
import pizza_factory.abstract_factory.pizza.VeggiesPizza;
import pizza_factory.abstract_factory.pizza_ingredient.NYPizzaIngredientFactory;
import pizza_factory.abstract_factory.pizza_ingredient.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        //Фабрика производит ингредиенты для всех пицц в нью-йорском стиле
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if(type.equals("veggie")){
            pizza = new VeggiesPizza(ingredientFactory);
            pizza.setName("New Yokr Style Vegggie Pizza");
        }else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New Yokr Style Clam Pizza");
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }

        return pizza;
    }
}
