package edu.academy.jc.gapaniuk.hw6i7;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        Test T = new Test();
        FoodGreen first = new FoodGreen();
        first.setName("apple");
        first.type= FoodType.FRUIT;

        FoodGreen first1 = new FoodGreen();
        first1.setName("orange");
        first1.type=FoodType.FRUIT;

        FoodGreen first2 = new FoodGreen();
        first2.setName("pork");
        first2.type=FoodType.MEAT;


        Food[] foods={first,first1,first2};
        System.out.println(T.isVegetarian(foods));
        System.out.println(first1.getName());


    }
    boolean isVegetarian(Food[] foods){
        for (int i=0;i<foods.length;i++){
            switch (foods[i].getFoodType()){
                case FISH:
                case MEAT: {
                    return false;
                }

            }

        }
        return true;
    }
}
