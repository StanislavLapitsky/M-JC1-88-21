package edu.academy.jc.gapaniuk.cw9;

import java.util.Comparator;

public class CompareByName implements Comparator<User> {
    public int compare(User u1, User u2) {
        return u1.getName().compareTo(u2.getName());
    }

}
