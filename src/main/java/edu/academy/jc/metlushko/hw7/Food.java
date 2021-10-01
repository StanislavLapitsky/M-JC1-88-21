package edu.academy.jc.metlushko.hw7;

public abstract class Food {

    private String name = "";

    public abstract FoodType getFoodType();

    public abstract void setFoodType(FoodType foodType);

}