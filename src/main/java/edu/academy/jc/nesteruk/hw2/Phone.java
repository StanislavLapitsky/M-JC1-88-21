package edu.academy.jc.nesteruk.hw2;

public class Phone {
    String number;
    String model;
    int weight;

    public Phone(){}

    public Phone(String number, String model){
        this(number, model, 432);
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }


    public void receiveCall(String name, String number){
        System.out.println("Звонит " + name + "\n" + "Номер " + number);

    }

    public void sendMessage (String... numbers){
        for (String number: numbers){
            System.out.println(number);
        }
    }

    public String getNumber() {
        return number;
    }
}
