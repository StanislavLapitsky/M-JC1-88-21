package edu.academy.jc.yarokhovich.hw6_7;

public class Milkshake extends Food {

    @Override
    public FoodType getFoodType() {
        return FoodType.MILK;
    }

    public Milkshake(String name) {
        super(name);
    }
}
