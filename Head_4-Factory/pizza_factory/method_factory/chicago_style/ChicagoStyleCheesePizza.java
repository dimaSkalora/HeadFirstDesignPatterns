package pizza_factory.method_factory.chicago_style;

import pizza_factory.method_factory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    //Чикагская пицца использует томатный соус и готовится на толстой основе
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        //В чикагской пицци кладут много сыра "Моцарелла"!
        toppings.add("Shredded Mozzarella Cheese");
    }

    //Чекагская пицца также переопределяет метод cut(), она нарезается не клиньями, а квадратами.
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
