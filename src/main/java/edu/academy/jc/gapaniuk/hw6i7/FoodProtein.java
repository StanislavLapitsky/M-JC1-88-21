package edu.academy.jc.gapaniuk.hw6i7;

public class FoodProtein extends Food {
    private String name;
    public FoodType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public FoodType getFoodType() {
        return this.type;
    }
}

