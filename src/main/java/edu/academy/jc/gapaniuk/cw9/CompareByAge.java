package edu.academy.jc.gapaniuk.cw9;


import java.util.Comparator;

public class CompareByAge implements Comparator<User> {
    public int compare(User u1, User u2) {
        if ((u1.getAge() == null) & (u2.getAge() == null)) {
            return 0;
        } else {
            if (u1.getAge() == null) {
                return 1;
            }
            if (u2.getAge() == null) {
                return -1;
            }
        }
        return u1.getAge().compareTo(u2.getAge());
    }

}
