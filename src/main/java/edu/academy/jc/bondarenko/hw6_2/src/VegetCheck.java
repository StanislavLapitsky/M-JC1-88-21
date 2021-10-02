public class VegetCheck {
    public enum Food{
        MEAT, FISH, FRUIT, VEGETABLE, MILK, UNKNOWN
    }
    private Food food;
    private VegetCheck vegetCheck;
    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public boolean isVegetarian(Food[] foods){
        if(getFood()==Food.FISH ||getFood()==Food.FRUIT || getFood()==Food.VEGETABLE)
            return true;
        else return false;
    }
    public void isVegetarian1(Food[] foods) {
        Food food = Food.VEGETABLE;
        switch (food) {
            case MEAT:
                System.out.println("Meat isn't vegetarian");
                break;
            case FISH:
                System.out.println("Fish isn't vegetarian food");
                break;
            case FRUIT:
                System.out.println("Fruits are vegetarian food");
                break;
            case VEGETABLE:
                System.out.println("Vegetables are the best vegetarian food");
                break;
            case MILK:
                System.out.println("Vegetarian people don't eat milk");
            default:
                System.out.println("They always check the products, that they want to eat" );
                break;
        }
    }


    public static void main(String[]args){
        VegetCheck vegetCheck=new VegetCheck();
        Food[]foods=Food.values();
        if(vegetCheck.isVegetarian(foods))
            System.out.println("This list of products is vegetarian");
        else System.out.println("This list of products isn't vegetarian");
        System.out.println();
        vegetCheck.isVegetarian1(foods);
    }
}
