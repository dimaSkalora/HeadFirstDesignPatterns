package starbuzz.beverage;

import starbuzz.Beverage;

public class Decaf extends Beverage {
    public Decaf(int size) {
        this.size=size;
        description="Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
