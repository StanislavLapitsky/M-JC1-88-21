package edu.academy.jc.gapaniuk.cw9;


import java.util.Comparator;

public class CompareByAge implements Comparator<User> {
    public int compare(User u1, User u2) {
        return u1.getAge().compareTo(u2.getAge());
    }

}
