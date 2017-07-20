package pizza_factory.method_factory.ny_style;

import pizza_factory.method_factory.Pizza;
import pizza_factory.method_factory.PizzaStore;

//createPizza() возвращает обьект Pizza, а субкласс несет полную
//отвественность за создаваемый конкретный экземпляр Pizza
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        switch (item){
            case "cheese" :
                return new NYStyleCheesePizza();
            case "veggie" :
                return new NYStyleVeggiePizza();
            case "clam" :
                return new NYStyleClamPizza();
            case "pepperoni" :
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
}
