package starbuzz.beverage;

import starbuzz.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(int size) {
        this.size=size;
        description="House Blend Coffe";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
