package edu.academy.jc.metlushko.hw7;

public class ThirdCourse extends Food{
    private String name;
    private FoodType foodType;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    @Override
    public void setFoodType(FoodType foodType){
        this.foodType=foodType;
    }
    @Override
    public FoodType getFoodType() {
        return this.foodType;
    }

}
