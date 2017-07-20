package pizza_factory.method_factory.ny_style;


import pizza_factory.method_factory.Pizza;

public class NYStyleCheesePizza extends Pizza {
    //Нью-йорская пицца готовится с соусом "маринара" на тонкой основе
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        //Одна добавка: сыр "Реджано!"
        toppings.add("Grated Reggiano Cheese");
    }
}
