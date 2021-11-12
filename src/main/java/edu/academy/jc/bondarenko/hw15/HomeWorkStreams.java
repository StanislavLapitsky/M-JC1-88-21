package edu.academy.jc.bondarenko.hw15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWorkStreams {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");

        List<String> tempList = myList.stream()
                .filter(string -> !string.contains("3"))
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return String.valueOf(o1.charAt(1)).compareTo(String.valueOf(o2.charAt(1)));
                    }
                })
                .skip(1)
                .peek(x -> System.out.print(x + " "))
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o2.compareTo(o1);
                    }
                })
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .map(o -> o.toUpperCase())
                .peek(x -> System.out.print(x + " "))
                .collect(Collectors.toList());
        System.out.println();
        Iterator<String> iterator=tempList.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()+ " ");
    }
}


