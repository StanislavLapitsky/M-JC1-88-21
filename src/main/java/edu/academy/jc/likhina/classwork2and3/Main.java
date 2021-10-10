package edu.academy.jc.likhina.classwork2and3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("audi", "green", 50);
        Car car2 = new Car("merc", "red", 60);




        System.out.println(car1.getColor());
        System.out.println(car2.getColor());
        System.out.println(car1.getModel());
        System.out.println(car2.getModel());
        System.out.println(car1.getModel() + ":" + car1.accelerate(car1.Speed));
        System.out.println(car2.getModel() + ":" + car2.accelerate(car2.Speed));
        if (car1.Speed > car2.Speed) {
            System.out.println(car1.getModel() + "-Win!");
        } else System.out.println("Win: " + car2.getModel());
        System.out.println(car1.getModel() + ":" + car1.slowDown(50));
        System.out.println(car2.getModel() + ":" + car2.slowDown(50));

        printMamory();

        ArrayList list = new ArrayList();
        for (int i = 0; i < 1000; i++) {
            list.add(new Car[i]);
        }
        printMamory();
        Runtime.getRuntime().gc();
        printMamory();

    }

    private static void printMamory() {
        System.out.println("Max mem:" + Runtime.getRuntime().maxMemory());
        System.out.println("Total mem:" + Runtime.getRuntime().totalMemory());
        System.out.println("Free mem:" + Runtime.getRuntime().freeMemory());
    }
}
