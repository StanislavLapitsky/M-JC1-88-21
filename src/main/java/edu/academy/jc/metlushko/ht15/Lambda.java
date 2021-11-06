package it.ht15Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        System.out.println(method(Arrays.asList("c5", "b1", "a1", "a2", "a3", "b3", "c2", "c1")));
    }

    private static int method(List<String> myList) {
        return (int) myList.stream()
                .filter(str -> !str.substring(1).equals("3"))
                .sorted((o1, o2) -> o1.substring(1).compareTo(o2.substring(1)))
                .sorted((o1, o2) -> o2.compareTo(o1))
                .skip(1)
                .sorted(String::compareTo)
                .skip(1)
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .count();
    }
}

