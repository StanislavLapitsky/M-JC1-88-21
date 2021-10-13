package edu.academy.jc.metlushko.lesson9;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public static void main(String[] args) {
        User vacya = new User("Peter", 25);
        User peter = new User("Vacya", 30);
        User x = new User(null, null);
        User kolya = new User("Kolya", null);
        User kolya2 = new User(null, 26);
        User artem = new User("Artem", null);
        User artem2 = new User(null,56 );

        ComparatorSortName comparatorSortName = new ComparatorSortName();
        ComparatorSortAge comparatorSortAge = new ComparatorSortAge();

        List<User> arrayList = new ArrayList<>();
        arrayList.add(vacya);
        arrayList.add(peter);
        arrayList.add(x);
        arrayList.add(kolya);
        arrayList.add(kolya2);
        arrayList.add(artem);
        arrayList.add(artem2);



        arrayList.sort(comparatorSortName);
        System.out.println(arrayList);

        arrayList.sort(comparatorSortAge);
        System.out.println(arrayList);


    }
}
