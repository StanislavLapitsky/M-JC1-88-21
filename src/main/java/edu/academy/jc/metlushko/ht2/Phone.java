package edu.academy.jc.metlushko.ht2;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Call : "+name);
    }

    public void receiveCall(String name,int number){
        System.out.println("Call "+name+" his number: "+number);
    }


    public Phone(int number, String model, int weight) {
        this(3947710,"M12");
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(){}

    public static void sendMessage(int...numbers){
        System.out.println("These numbers send message :");
        for(int i:numbers){
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        //1
        Phone iPhone=new Phone();
        Phone nokia=new Phone(3947710,"3310");
        Phone samsung=new Phone(10255877,"A12",120);
        System.out.println();

        //2
        iPhone.setModel("iPhone");
        System.out.println(iPhone.getModel());
        System.out.println("Nokia :"+nokia.getModel()+" number "+nokia.getNumber());
        System.out.println("Samsung :"+samsung.getModel()+" number "+samsung.getNumber()+" weight "+samsung.weight);
        System.out.println();

        //3
        iPhone.receiveCall("Mother");
        nokia.receiveCall("Father");
        samsung.receiveCall("Boss");
        System.out.println();

        //9
        iPhone.receiveCall("Andrey",5874123);
        iPhone.receiveCall("Sergey",5478963);

        //10
        sendMessage(3947710,1254785,365874,102);




    }

}
