package edu.academy.jc.gapaniuk.cw7;

public class Person extends Student{
    public static void main(String[] args) {
        Person sasha = new Person();
//        sasha.setGrant((byte)100);
        sasha.setSalary(50);
        System.out.println(sasha.getIncome(2));
//        Calculate c1 = new CalculateImpl1();
//        Calculate c2 = new CalculateImpl2();
//        if (c1.multiply(2,2)!=c2.multiply(2,2)){
//            System.out.println("error 1");
//        }
//        else System.out.println(c1.multiply(2,2));
//        if (c1.divide(2,2)!=c2.divide(2,2)){
//            System.out.println("error 2");
//        }
//        else System.out.println(c1.divide(2,2));

    }
    private Integer salary;
    @Override
    public int getIncome(int i){
        if (this.getSalary() ==null){
            return super.getIncome(2)+i;
        }
        else {
            return super.getIncome(2)+i+ this.getSalary();
        }
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
