import java.util.Scanner;
public class Food1 extends Food {
    private FoodType foodType;
    @Override
    protected void getFoodTypE(){
        for(FoodType foodType: FoodType.values())
         System.out.println(foodType);
    }
    public FoodType getFoodType() {

        return foodType;
    }
    public void setFoodType(FoodType foodType) {

        this.foodType = foodType;
    }
    public static void main(String[] args){
        Food1 food1=new Food1();
        food1.getFoodTypE();
    }
}
