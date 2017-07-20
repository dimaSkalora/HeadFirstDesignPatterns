package pizza_Incomplete_factory;

////Неполноценная фабрика
//Класс SimplePizzaFactory занимается исключительно созданием пиццы для своих клиентов.
public class SimplePizzaFactory {
    //Будет исполльзоватся всеми клиентами для создания новых обьектов.
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese"))
            pizza = new CheesePizza();
        else if(type.equals("pepperoni"))
            pizza = new PepperoniPizza();
        else if(type.equals("clam"))
            pizza = new ClamPizza();
        else if(type.equals("veggie"))
            pizza = new VeggiePizza();

        return pizza;
    }
}
