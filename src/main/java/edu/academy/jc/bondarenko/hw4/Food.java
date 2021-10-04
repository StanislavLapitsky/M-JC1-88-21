package edu.academy.jc.bondarenko.hw4;

public abstract class Food {
    abstract protected void getFoodTypE();
    public enum FoodType{
        MEAT, FISH, FRUIT, VEGETABLE, MILK, UNKNOWN
    }
}
