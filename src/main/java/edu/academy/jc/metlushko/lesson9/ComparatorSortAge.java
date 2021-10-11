package edu.academy.jc.metlushko.lesson9;

import java.util.Comparator;
import java.util.Objects;

public class ComparatorSortAge implements Comparator<User> {
    @Override
    public int compare(User obj1,User obj2){

        return Objects.requireNonNull(obj1).getAge().compareTo(Objects.requireNonNull(obj2).getAge());
    }
}
