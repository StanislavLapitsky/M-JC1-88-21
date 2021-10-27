package edu.academy.jc.tsimafeitestgit.hw2;

public class PhoneMain {
    public static void main(String[] args) {
        Phone ph1 = new Phone(3558585, "samsung", 14);
        Phone ph2 = new Phone(3554242, "apple", 1);
        Phone ph3 = new Phone(3551313, "zion", 11);

        System.out.println("phone 1: " + "Model is: " + ph1.model + " number is: " + ph1.number + " weight is: " + ph1.weight);
        System.out.println("phone 2: " + "Model is: " + ph2.model + " number is: " + ph2.number + " weight is: " + ph2.weight);
        System.out.println("phone 3: " + "Model is: " + ph3.model + " number is: " + ph3.number + " weight is: " + ph3.weight);

        System.out.println("number is: " + ph1.getNumber());
        System.out.println("number is: " + ph2.getNumber());
        System.out.println("number is: " + ph3.getNumber());

        Phone ph4 = new Phone(37529233, "Szael", 8);
        System.out.println(ph1.receiveCall());
    }
}

//почему-то выводит 'name' отдельно...