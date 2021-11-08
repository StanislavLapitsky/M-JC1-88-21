package edu.academy.jc.bondarenko.hw10;

import java.util.Comparator;

public class ComparatorByName implements Comparator<UsersColl> {
    @Override
    public int compare(UsersColl u1, UsersColl u2){
        return u1.getName().compareTo(u2.getName());
    }
}
