package edu.academy.jc.metlushko.lesson9;

import java.util.Comparator;

public class ComparatorSortAge implements Comparator<User> {
    @Override
    public int compare(User obj1, User obj2) {

        if (obj1.getAge() == null && obj2.getAge() == null) {
            return 0;
        }
        if (obj1.getAge() != null && obj2.getAge() == null) {
            return obj1.getAge().compareTo(0);
        }
        if (obj1.getAge() == null && obj2.getAge() != null) {
            return Integer.valueOf(0).compareTo(obj2.getAge());
        }


        return obj1.getAge().compareTo(obj2.getAge());
    }
}
