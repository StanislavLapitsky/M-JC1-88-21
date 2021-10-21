package edu.academy.jc.yarokhovich.hw6_7;

public abstract class Food {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food(String name) {
        this.name = name;
    }

    public Food() {
    }

    public abstract FoodType getFoodType();
}
