package edu.academy.jc.gapaniuk.hw14i15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StrimLambda {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "b2", "a3", "b1", "b3", "c2", "d1", "c5");
        Long a = myList.stream()
                .filter(x -> x.matches("[a-z][^3]"))
                .sorted((x, y) -> String.valueOf(x.charAt(1)).compareTo(String.valueOf(y.charAt(1))))
                // first variant
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return String.valueOf(o1.charAt(1)).compareTo(String.valueOf(o2.charAt(1)));
                    }
                })
                // second variant
                .sorted()
                .skip(1)
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return -o1.compareTo(o2);
                    }
                })
                .skip(1)
                .sorted()
                .map(String::toUpperCase)
                .peek(x -> System.out.print(x + " "))

                .count();

        System.out.println(a + "  ");

        for (String sss : myList) {
            System.out.print(sss + " ");
        }
    }
}
