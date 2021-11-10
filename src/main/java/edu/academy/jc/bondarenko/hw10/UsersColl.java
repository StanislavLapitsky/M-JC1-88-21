package edu.academy.jc.bondarenko.hw10;


public class UsersColl {
    private String name;
    private Integer number;


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public UsersColl(String name){
        this.name=name;
    }
    public UsersColl(String name, Integer number){
        this.name=name;
        this.number=number;
    }
    public UsersColl(int number){
        this.number=number;
    }
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(name + " ");
        sb.append(number + " ");
        return sb.toString();
    }
}
