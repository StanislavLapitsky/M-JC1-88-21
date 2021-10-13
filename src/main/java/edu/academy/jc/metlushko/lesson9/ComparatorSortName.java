package edu.academy.jc.metlushko.lesson9;

import java.util.Comparator;

public class ComparatorSortName implements Comparator<User> {
    @Override
    public int compare(User obj1, User obj2) {
        if (obj1.getName() == null && obj2.getName() == null) {

            return 0;
        }
        if (obj1.getName() == null && obj2.getName() != null) {

            return String.valueOf("").compareTo(obj2.getName());
        }
        if (obj1.getName() != null && obj2.getName() == null) {

            return obj1.getName().compareTo(String.valueOf(""));
        }

        return obj1.getName().compareTo(obj2.getName());
    }
}
