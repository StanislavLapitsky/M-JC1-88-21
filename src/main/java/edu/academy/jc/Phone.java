package edu.academy.jc;

public class Phone {

    private int Number;
    private String Model;
    private double Weight;

    public void receiveCall(String name){
        System.out.println("Is calling "+name);
    }

    public int getNumber() {
        return Number;
    }

    public Phone(int number, String model, double weight) {
        this(number,model);
        this.Weight = weight;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
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
        System.out.println("Is calling "+name+", number - "+number);
    }
    /* public int sendMessage(int i,int...)
     {
      return i;

     }*/
}





