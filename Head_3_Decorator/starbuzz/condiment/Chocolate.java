package starbuzz.condiment;

import starbuzz.Beverage;

//Шоколад
public class Chocolate extends CondimentDecorator{
    Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Chocolate";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(getSize() == Beverage.TALL)
            cost += 0.10;
        else if(getSize() == Beverage.GRANDE)
            cost += 0.15;
        else if(getSize() == Beverage.VENTI)
            cost += 0.20;
        return cost;
    }
}
