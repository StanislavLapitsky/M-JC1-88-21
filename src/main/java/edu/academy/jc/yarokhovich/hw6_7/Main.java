package edu.academy.jc.yarokhovich.hw6_7;

public class Main {
    public static void main(String[] args) {
        Food food1 = new Cucumber();
        food1.setName("Cucumber");
        Food food2 = new Milkshake("MilkShake");
        Food food3 = new StewedMeat("Pork");
        Food food4 = new StewedMeat("Chicken");
        Food[] breakfast = {food1, food2};
        Food[] dinner = {food3, food4, food2};
        System.out.println(CheckIngredient.isVegetarian(breakfast));
        System.out.println(CheckIngredient.isVegetarian(dinner));
    }
}
