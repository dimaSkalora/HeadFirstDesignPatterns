package pizza_factory.method_factory;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    //Фабричный метод стал абстрактным методом PizzaStore
    //Вся отвественность за создание экземпляров Pizza перемещенна в метод, действующий как фабрика
    //Фабричный метод отвечает за создание обьектов и инкапсулирует эту операцию в субклассу.
    //Таким образом клиентский код в суперклассе отделяется от кода создания обьекта в субклассе.
    public abstract Pizza createPizza(String type);
}
