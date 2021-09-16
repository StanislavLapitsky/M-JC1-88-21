package edu.academy.jc;

public class Phone {

    public int Number;
    public String Model;
    public double Weight;

    public void receiveCall(String name){
        System.out.println("Звонит "+name);
    }

    public int getNumber() {
        return Number;
    }

    public Phone(int number, String model, double weight) {
        this(number,model);
        this.Weight = weight;
    }

    public Phone(int number, String model) {
        this.Number = number;
        this.Model = model;
    }

    public Phone (){
       this.Number = 0;
       this.Model = null;
       this.Weight=0;

    }

    public void receiveCall(String name,int number){
        System.out.println("Вызывает "+name+", номер - "+number);
    }
    /* public int sendMessage(int i,int...)
     {
      return i;

     }*/
}





