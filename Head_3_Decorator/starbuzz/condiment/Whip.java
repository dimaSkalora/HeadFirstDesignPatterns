package starbuzz.condiment;

import starbuzz.Beverage;

//взбитые сливки
public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
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
