package edu.academy.jc.yarokhovich.hw6_7;

public class CheckIngredient {

    public static boolean isVegetarian(Food[] foods) {
        for (Food elem : foods) {
            if(FoodType.MEAT.equals(elem.getFoodType())){
                return false;
            }
        }
        return true;
    }
}
