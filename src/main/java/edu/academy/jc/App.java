package edu.academy.jc;

public class App {
    public static void main(String[] args) {

            Phone apple = new Phone(123,"apple",0.15);
            Phone siemens = new Phone(456,"siemens",0.26);
            Phone nokia = new Phone(789,"nokia",0.33);

            apple.Number = 123;
            siemens.Number =456;
            nokia.Number=789;

            apple.Model = "apple";
            siemens.Model = "siemens";
            nokia.Model = "nokia";

            apple.Weight = 0.15;
            siemens.Weight = 0.26;
            nokia.Weight = 0.33;

            System.out.println(apple.Model+" "+apple.Number+" "+apple.Weight);
            System.out.println(siemens.Model+" "+siemens.Number+" "+siemens.Weight);
            System.out.println(nokia.Model+" "+nokia.Number+" "+nokia.Weight);

            System.out.println( "Номер телефона - "+apple.getNumber());
            System.out.println("Номер телефона - "+siemens.getNumber());
            System.out.println("Номер телефона - "+ nokia.getNumber());

            apple.receiveCall("Sasha");
            siemens.receiveCall("Victor");
            nokia.receiveCall("Vlad");

            apple.receiveCall("Sasha", apple.getNumber());
            siemens.receiveCall("Victor", siemens.getNumber());
            nokia.receiveCall("Vlad", nokia.getNumber());


        }
    }


