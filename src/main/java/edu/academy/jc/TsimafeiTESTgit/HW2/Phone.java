package edu.academy.jc.TsimafeiTESTgit.HW2;

public class Phone {
    String number;
    String model;
    int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

//    public receiveCall()

    public static void main(String[] args) {
        Phone ph1 = new Phone("355-85-85", "samsung", 14);
        Phone ph2 = new Phone("355-42-42", "apple", 1);
        Phone ph3 = new Phone("355-13-13", "zion", 11);

        System.out.println("phone 1: " + "Model is: " + ph1.model + " number is: " + ph1.number+" weight is: " + ph1.weight);
        System.out.println("phone 2: " + "Model is: " + ph2.model + " number is: " + ph2.number+" weight is: " + ph2.weight);
        System.out.println("phone 3: " + "Model is: " + ph3.model + " number is: " + ph3.number+" weight is: " + ph3.weight);
    }
}

