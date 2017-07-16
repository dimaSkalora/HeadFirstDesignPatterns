package starbuzz.beverage;

import starbuzz.Beverage;

public class Espresso extends Beverage {
    public Espresso(int size) {
        this.size=size;
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
