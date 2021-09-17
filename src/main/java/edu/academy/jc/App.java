package edu.academy.jc;

public class App {
    public static void main(String[] args) {
        Phone apple = new Phone();
        Phone siemens = new Phone();
        Phone nokia = new Phone();

        apple.setModel("apple");
        siemens.setModel("siemens");
        nokia.setModel("nokia");

        apple.setNumber(123);
        siemens.setNumber(456);
        nokia.setNumber(789);

        apple.setWeight(0.15);
        siemens.setWeight(0.26);
        nokia.setWeight(0.33);

        System.out.println((apple.getModel()+" "+apple.getNumber()+" "+apple.getWeight()));
        System.out.println((siemens.getModel()+" "+siemens.getNumber()+" "+siemens.getWeight()));
        System.out.println((nokia.getModel()+" "+nokia.getNumber()+" "+nokia.getWeight()));

        System.out.println("Number phone - " + apple.getNumber());
        System.out.println("Number phone - " + siemens.getNumber());
        System.out.println("Number phone - " + nokia.getNumber());

        apple.receiveCall("Sasha");
        siemens.receiveCall("Victor");
        nokia.receiveCall("Vlad");
    }
}


