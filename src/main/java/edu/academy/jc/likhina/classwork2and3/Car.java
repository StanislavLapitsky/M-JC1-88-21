package edu.academy.jc.likhina.classwork2and3;

public class Car {
    String Model;
    String Color;
    int Speed;

    private Car(String model, String color) {
        Model = model;
        Color = color;
    }

    public Car(String model, String color, int speed) {
        this(model, color);
        this.Speed = speed;
    }


    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public int accelerate(int speed) {
        Speed = speed + 50;
        return Speed;
    }

    public int slowDown(int speed) {
        Speed = speed - 50;
        return Speed;
    }


}
