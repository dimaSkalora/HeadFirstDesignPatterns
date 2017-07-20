package pizza_factory.method_factory.california_style;

import pizza_factory.method_factory.Pizza;
import pizza_factory.method_factory.PizzaStore;

//createPizza() возвращает обьект Pizza, а субкласс несет полную
//отвественность за создаваемый конкретный экземпляр Pizza
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        switch (item){
            case "cheese" :
                return new CaliforniaStyleCheesePizza();
            case "veggie" :
                return new CaliforniaStyleVeggiePizza();
            case "clam" :
                return new CaliforniaStyleClamPizza();
            case "pepperoni" :
                return new CaliforniaStylePepperoniPizza();
            default:
                return null;
        }
    }
}
