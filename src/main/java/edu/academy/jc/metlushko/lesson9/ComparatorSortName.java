package edu.academy.jc.metlushko.lesson9;

import java.util.Comparator;

public class ComparatorSortName implements Comparator<User> {
    @Override
    public int compare(User obj1,User obj2){
        return obj1.getName().compareTo(obj2.getName());
    }
}
