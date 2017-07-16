package starbuzz;

import starbuzz.beverage.DarkRoast;
import starbuzz.beverage.Decaf;
import starbuzz.beverage.Espresso;
import starbuzz.beverage.HouseBlend;
import starbuzz.condiment.Chocolate;
import starbuzz.condiment.Mocha;
import starbuzz.condiment.Soy;
import starbuzz.condiment.Whip;

//Decorator
public class StarbuzzCoffe {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso(15);
        System.out.println(beverage1.getDescription()+" - $"+beverage1.cost());

        Beverage beverage2 = new DarkRoast(10);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()+" - $"+beverage2.cost());

        Beverage beverage3 = new HouseBlend(15);
        beverage3=new Soy(beverage3);
        beverage3=new Mocha(beverage3);
        beverage3=new Whip(beverage3);
        System.out.println(beverage3.getDescription()+" - $"+beverage3.cost());

        Beverage beverage4 = new Decaf(20);
        beverage4=new Chocolate(beverage4);
        beverage4=new Whip(beverage4);
        System.out.println(beverage4.getDescription()+" - $"+beverage4.cost());
    }
}
