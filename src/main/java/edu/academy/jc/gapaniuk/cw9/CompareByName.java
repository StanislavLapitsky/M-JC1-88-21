package edu.academy.jc.gapaniuk.cw9;

import java.util.Comparator;

public class CompareByName implements Comparator<User> {
    public int compare(User u1, User u2) {
        if ((u1.getName() == null) & (u2.getName() == null)) {
            return 0;
        } else {
            if (u1.getName() == null) {
                return 1;
            }
            if (u2.getName() == null) {
                return -1;
            }
        }


        return u1.getName().compareTo(u2.getName());
    }

}
