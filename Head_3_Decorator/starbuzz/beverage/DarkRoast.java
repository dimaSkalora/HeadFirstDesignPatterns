package starbuzz.beverage;

import starbuzz.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(int size) {
        this.size=size;
        description="Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
