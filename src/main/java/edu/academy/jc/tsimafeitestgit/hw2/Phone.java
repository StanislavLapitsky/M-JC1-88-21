package edu.academy.jc.tsimafeitestgit.hw2;

public class Phone {
    int number;
    String model;
    int weight;
    String name = "name";

    public Phone(int newNumber, String newModel, int newWeight) {
        number = newNumber;
        model = newModel;
        weight = newWeight;
    }

    public Phone(int newNumber, String newModel) {
        this.number = newNumber;
        this.model = newModel;
    }

    public Phone() {
    }

    public String receiveCall() {
        System.out.println("Звонит " + "{" + name + "}");
        return this.name;
    }

    public void receiveCall(String name, String number) {
        return;
    }

    public int getNumber() {
        return this.number;
    }

    //вынесем main в отдельный класс, а тут оставим только "конструктор"...
}

