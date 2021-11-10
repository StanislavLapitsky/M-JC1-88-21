package edu.academy.jc.bondarenko.hw10;

import java.util.Comparator;

public class ComparatorByNumber implements Comparator<UsersColl> {
    @Override
    public int compare(UsersColl u1, UsersColl u2){
        if(u1.getNumber()>u2.getNumber())
            return 1;
        else if(u1.getNumber()<u2.getNumber())
            return -1;
        else return 0;
    }
}
