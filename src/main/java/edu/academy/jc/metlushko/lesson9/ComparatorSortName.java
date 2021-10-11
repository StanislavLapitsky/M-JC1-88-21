package edu.academy.jc.metlushko.lesson9;

import java.util.Comparator;
import java.util.Objects;

public class ComparatorSortName implements Comparator<User> {
    @Override
    public int compare(User obj1, User obj2){

        return Objects.requireNonNull(obj1).getName().compareTo(Objects.requireNonNull(obj2).getName());
    }
}
