package edu.academy.jc.yarokhovich.hw6_7;

public class StewedMeat extends Food {

    @Override
    public FoodType getFoodType() {
        return FoodType.MEAT;
    }

    public StewedMeat(String name) {
        super(name);
    }
}
