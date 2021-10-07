package edu.academy.jc.likhina.hw6and7;

public class Macdonalds extends Food {
    private String name;
    private FoodType foodType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public FoodType getFoodType() {
        return this.foodType;
    }

    @Override
    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }
}
