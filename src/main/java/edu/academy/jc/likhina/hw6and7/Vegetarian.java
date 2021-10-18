package edu.academy.jc.likhina.hw6and7;

public class Vegetarian extends Food {
    public static void main(String[] args) {
        Food restaurant = new Restaurant();
        restaurant.setFoodType(FoodType.MEAT);

        Food cafe = new Cafe();
        cafe.setFoodType(FoodType.FISH);

        Food macdonnalds = new Macdonalds();
        macdonnalds.setFoodType(FoodType.MILK);

        Food vegetarian = new Vegetarian();
        vegetarian.setFoodType(FoodType.FRUIT);

        System.out.println(macdonnalds.getFoodType());
        System.out.println(cafe.getFoodType());
        System.out.println(restaurant.getFoodType());
        System.out.println(vegetarian.getFoodType());

        Food[] arr1 = new Food[]{restaurant, cafe, macdonnalds, vegetarian};
        Food[] arr2 = new Food[]{cafe, macdonnalds, vegetarian};
        Food[] arr3 = new Food[]{macdonnalds, vegetarian};

        System.out.println(isVegetarian(arr1));
        System.out.println((isVegetarian(arr2)));
        System.out.println((isVegetarian(arr3)));
    }

    private String name;
    private FoodType foodType;

    @Override
    public FoodType getFoodType() {
        return this.foodType;
    }

    @Override
    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    static boolean isVegetarian(Food[] foods) {
        for (Food food : foods) {
            if ((food.getFoodType().name().equals(FoodType.FISH.name())) || (food.getFoodType().name().equals(FoodType.MEAT.name())) || (food.getFoodType().name().equals(FoodType.UNKNOWN.name()))) {
                return false;
            } else return true;
        }
        return true;
    }

}


