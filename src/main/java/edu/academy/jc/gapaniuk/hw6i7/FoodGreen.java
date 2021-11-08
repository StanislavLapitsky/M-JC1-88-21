package edu.academy.jc.gapaniuk.hw6i7;

public class FoodGreen extends Food {
    private String name;
    public FoodType type;


    @Override
    public FoodType getFoodType() {
        return this.type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
