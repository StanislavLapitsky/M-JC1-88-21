package edu.academy.jc.Gapaniuk.HW2;

public class Phone {
    public static void main(String[] args) {
       //Creating three instances of a class - start
        Phone first = new Phone();
        Phone second = new Phone(234,"Huaw",120);
        Phone third = new Phone(456,"aif");
        //Creating three instances of a class - finish
        second.receiveCall(second.name);
        first.receiveCall(third.name,third.number);
        System.out.println(first.getNumber());
        System.out.println(second.getNumber());
        System.out.println(third.model);

        first.sendMessage(first.number, second.number, third.number);


    }
    int number = 123;
    String model = "Sumsung";
    int weight = 100;
    String name= "Sergey";

    public Phone(int number, String model, int weight){
        this(123,"ggg");
        this.number=number;
        this.model=model;
        this.weight=weight;

    }
    public Phone(int number, String model){
        this.number=number;
        this.model=model;

    }
    public Phone(){
        this.number=1000;
    }

    public void receiveCall(String collerName){
        System.out.println("Calling "+collerName);
    }
    public void receiveCall(String collerName,int collerNum){
        System.out.println("Calling "+collerName+" his number "+collerNum);
    }

    public int getNumber() {
        return number;
    }
    public void sendMessage(int ... arg){
        for (int i:arg){
            System.out.println(i);
        }
    }
}
