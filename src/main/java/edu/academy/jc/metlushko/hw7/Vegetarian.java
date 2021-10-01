package edu.academy.jc.metlushko.hw7;

public class Vegetarian extends Food  {
    public static void main(String[] args) {

        Food firstCourse=new FirstCourse();
        firstCourse.setFoodType(FoodType.MILK);

        Food secondCourse1=new SecondCourse();
        secondCourse1.setFoodType(FoodType.FISH);

        Food secondCourse2=new SecondCourse();
        secondCourse2.setFoodType(FoodType.MEAT);

        Food thirdCourse=new ThirdCourse();
        thirdCourse.setFoodType(FoodType.FRUIT);

        Food vegetarian=new Vegetarian();
        vegetarian.setFoodType(FoodType.VEGETABLE);

        Food[] arrFoods=new Food[]{firstCourse,thirdCourse,vegetarian};
        System.out.println(isVegetarian(arrFoods));

        Food[] arrFoods2=new Food[]{secondCourse1,thirdCourse,vegetarian};
        System.out.println(isVegetarian(arrFoods2));

    }

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
    public static boolean isVegetarian(Food[]foods){
        boolean b = false;
        for (Food food : foods) {

            if (food.getFoodType().name().equals(FoodType.MILK.name()) ||
                    food.getFoodType().name().equals(FoodType.FRUIT.name()) ||
                    food.getFoodType().name().equals(FoodType.VEGETABLE.name())) {
                b = true;
            } else return false;
        }

        return b;
    }

}
