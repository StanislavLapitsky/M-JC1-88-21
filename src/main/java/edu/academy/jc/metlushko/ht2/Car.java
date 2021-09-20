package edu.academy.jc.metlushko.ht2;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;
    private String color;
    private short speed;

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

    public short accelerateSpeed(short speed)  {
        if(speed>=250){
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("car accelerates maximums speed: 250");

            }
        }
        else this.speed+=speed;
        return this.speed;
    }

    public short slowDownSpeed(short speed){
        this.speed-=speed;
        return this.speed;
    }
    private Car(){}

    Car(String model,String color){
        this.color=color;
        this.model=model;
    }
    Car(String model){
        this(model,"red");
        this.model=model;
    }
    public static void printMemory(){
        System.out.println("Max mem: "+Runtime.getRuntime().maxMemory());
        System.out.println("Total mem: "+Runtime.getRuntime().totalMemory());
        System.out.println("Free mem: "+Runtime.getRuntime().freeMemory()+"\n");
    }

    Car(int i){

    }

    public void oneHundredInstance(){
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            list.add(new Car(i));
        }
    }
    public void veryManyInstance(){
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < 1000_000_000; i++) {
            list.add(new Car(i));
        }
    }

    public static void main(String[] args)  {
        Car vaz=new Car( );
        Car reno=new Car( );
//        vaz.setColor("red");
//        reno.setColor("black");
//        reno.setModel("reno");
//
//        vaz.accelerateSpeed((short) 100);
//        vaz.setModel("vaz");
//
//
//        System.out.println(vaz.getModel()+"&"+reno.getModel());
//        System.out.println(reno.accelerateSpeed((short) 280));
//
//        reno.slowDownSpeed((short) 0);
//        vaz.slowDownSpeed((short) 0);


        printMemory();

        vaz.oneHundredInstance();
        printMemory();

        Runtime.getRuntime().gc();
        printMemory();

        vaz.veryManyInstance();
        printMemory();



    }

}
