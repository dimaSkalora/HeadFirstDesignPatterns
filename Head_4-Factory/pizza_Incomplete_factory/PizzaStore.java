package pizza_Incomplete_factory;

////Неполноценная фабрика
public class PizzaStore {
    //Классу PizzaStore передается ссылка на SimplePizzaFactory
    SimplePizzaFactory factory;

    //PizzaStore сохраняет ссылку на фабрику в конструторе
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    //Метод обращается к фабрике с запросом на зосдание обьекта, передавая тип заказа
    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
