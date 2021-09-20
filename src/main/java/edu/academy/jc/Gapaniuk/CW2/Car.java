package edu.academy.jc.Gapaniuk.CW2;

public class Car {
    public static void main(String[] args) {

        // write your code here
        Car car1 = new Car("mersedes");
        Car car2 = new Car("bmw");
        Car car3 = new Car("");

        car1.setColor("black");
        car2.setColor("red");
        while (car2.speed<100) {
            car2.accelerate(10);
        }
        car2.accelerate(200);
        System.out.println(car2.speed);

        while (car1.speed>0) {
            car1.slowDown(1);
        }
        System.out.println(car1.speed);
        printMemory();

        Car[][] Cars = new  Car[10000][10000];
        for(int i=0;i<1010;i++){
            Cars[1][i] = new Car("nnn");
        }
        printMemory();
        Runtime.getRuntime().gc();
        printMemory();
    }

    public static void printMemory() {
        System.out.println("Max nem:   "+Runtime.getRuntime().maxMemory());
        System.out.println("Total nem: "+Runtime.getRuntime().totalMemory());
        System.out.println("Free nem:  "+Runtime.getRuntime().freeMemory());

    }
    private String model;
    private String color;
    int speed;

    private Car(){
       this("BMW","Black");
    }

    public Car(String model) {
        this(model, "red");
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int accelerate(int speed) {
        if ((this.speed + speed)>250){
            System.out.println ("It is too fast!!");
            return this.speed;
        }
        else {
            return this.speed = this.speed + speed;
        }
    }

    public int slowDown(int speed) {
        return this.speed = this.speed - speed;
    }
}
