package edu.academy.jc.yarokhovich.hw2.phone;

import java.util.Arrays;

public class Phone {
    private int number;
    private String model;
    private String weight;

    public Phone(int number, String model, String weight) {
        this(number, model);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public int getNumber() {
        return this.number;
    }

    public void receiveCall(String callerName, int numberPhone) {
        System.out.println("Звонит " + callerName);
        System.out.println("Номер телефона " + numberPhone);
    }

    public void sendMessage(int... num) {
            System.out.println(Arrays.toString(num));
    }

}
