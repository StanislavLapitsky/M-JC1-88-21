package edu.academy.jc.yarokhovich.HW15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        lambdaAndStream(myList);
    }

    private static void lambdaAndStream(List<String> myList) {
        List<String> newList = myList.stream()
                .filter(string -> !string.contains("3"))
                .sorted(Comparator.comparing(o -> o.substring(1)))
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .map(o -> o.toUpperCase())
                .collect(Collectors.toList());
        int listCount = newList.size();
        List<String> newList2 = newList.stream().limit(listCount - 1).collect(Collectors.toList());
        System.out.println(newList2.toString());
    }
}
