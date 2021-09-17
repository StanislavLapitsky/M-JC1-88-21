package edu.academy.jc;

public class Phone {
    private int Number;
    private String Model;
    private double Weight;

    public void receiveCall(String name){
        System.out.println("Is calling "+name);
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public void receiveCall(String name,int number){
        System.out.println("Is calling "+name+", number - "+number);
    }
}
