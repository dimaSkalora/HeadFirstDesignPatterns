package pizza_factory.method_factory.chicago_style;

import pizza_factory.method_factory.Pizza;
import pizza_factory.method_factory.PizzaStore;

//createPizza() возвращает обьект Pizza, а субкласс несет полную
//отвественность за создаваемый конкретный экземпляр Pizza
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
    }
}
