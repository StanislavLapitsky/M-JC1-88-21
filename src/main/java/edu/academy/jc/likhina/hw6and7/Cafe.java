package edu.academy.jc.likhina.hw6and7;

public class Cafe extends Food {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private FoodType foodType;

    @Override
    public FoodType getFoodType() {
        return this.foodType;
    }

    @Override
    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }
}
