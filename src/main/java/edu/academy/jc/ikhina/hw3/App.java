package edu.academy.jc.ikhina.hw3;


public class App {
    public static void main(String[] args) {


            Phone apple = new Phone();
            Phone siemens = new Phone();
            Phone nokia = new Phone();




            apple.setModel("apple");
            apple.setNumber(123);
            apple.setWeight(0.15);

            siemens.setModel("siemens");
            siemens.setNumber(456);
            siemens.setWeight(0.26);

            nokia.setModel("nokia");
            nokia.setNumber(789);
            nokia.setWeight(0.33);



            System.out.println(apple.getModel()+" "+apple.getNumber()+" "+apple.getWeight());
            System.out.println(siemens.getModel()+" "+siemens.getNumber()+" "+siemens.getWeight());
            System.out.println(nokia.getModel()+" "+nokia.getNumber()+" "+nokia.getWeight());

            System.out.println( "Number phone - "+apple.getNumber());
            System.out.println("Number phone - "+siemens.getNumber());
            System.out.println("Number phone - "+ nokia.getNumber());

            apple.receiveCall("Sasha");
            siemens.receiveCall("Victor");
            nokia.receiveCall("Vlad");

            apple.receiveCall("Sasha", apple.getNumber());
            siemens.receiveCall("Victor", siemens.getNumber());
            nokia.receiveCall("Vlad", nokia.getNumber());


        }
    }


