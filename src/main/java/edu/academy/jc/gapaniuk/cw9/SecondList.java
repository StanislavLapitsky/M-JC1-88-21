package edu.academy.jc.gapaniuk.cw9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondList {
    public static void main(String[] args) {

        List<User> persInfo = new ArrayList<>();

        persInfo.add(0, new User("Sergey", 35));
        persInfo.add(1, new User("Victor", 34));
        persInfo.add(2, new User("Victoria", 31));
        persInfo.add(3, new User("Elena", 37));
        persInfo.add(4, new User("Victor", 35));
        persInfo.add(5, new User("Victor", 25));
        CompareByName compName= new CompareByName();
        persInfo.sort(compName);
        for (User a:persInfo){
            System.out.println(a.name+" "+a.age);
        }
        System.out.println("-------------------");

        CompareByAge compAge=new CompareByAge();
        persInfo.sort(compAge);
        for (User a:persInfo){
            System.out.println(a.name+" "+a.age);
        }
        System.out.println("-------------------");

       Comparator<User> compNameAge = new CompareByName().thenComparing(new CompareByAge());
        persInfo.sort(compNameAge);
        for (User a:persInfo){
            System.out.println(a.name+" "+a.age);
        }

    }

}
