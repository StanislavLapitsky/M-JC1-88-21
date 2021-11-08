package edu.academy.jc.metlushko.ht15;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    private String getLastElement(List<String> myList) {
        return myList.stream()
                .filter(str -> !str.substring(1).equals("3"))
                .sorted((o1, o2) -> o1.substring(1).compareTo(o2.substring(1)))
                .sorted((o1, o2) -> o2.compareTo(o1))
                .skip(1)
                .reduce((first, second) -> second)
                .orElse(null);
    }

    private long getCount(List<String> myList) {
        return myList.stream()
                .filter(str -> !str.substring(1).equals("3"))
                .sorted((o1, o2) -> o1.substring(1).compareTo(o2.substring(1)))
                .sorted((o1, o2) -> o2.compareTo(o1))
                .skip(1)
                .filter(str -> !str.equals(getLastElement(myList)))
                .map(String::toUpperCase)
                .count();
    }

    public static void main(String[] args) {

        Lambda lambda = new Lambda();
        lambda.getCount(Arrays.asList("c5", "b1", "a1", "a2", "a3", "b3", "c2", "c1"));

    }

}