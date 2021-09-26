package edu.academy.jc.yarokhovich.hw2;


import edu.academy.jc.yarokhovich.hw2.jc.Bike;
import edu.academy.jc.yarokhovich.hw2.jc.Car;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("bmw", "green");
        try {
            car1.accelerate();
            car1.accelerate();
            car1.accelerate();
            car1.accelerate();
            car1.accelerate();
        } catch (Exception e) {
            System.out.println("Exception: max speed");
        }
        Bike bike1 = new Bike();
        bike1.setColor("white");
        bike1.setSpeed(10);
    }
}
