package edu.academy.jc.likhina.hw14and15;

import java.util.*;

public class StreamAndLambda {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b2", "b3", "c2", "c1", "c5");
        System.out.println(returnStream(myList));
    }

    public static int returnStream(List<String> myList) {
        int stream = (int) myList
                .stream()
                .filter(s -> !s.contains("3"))
                .sorted((s1, s2) -> s1.substring(1).compareTo(s2.substring(1)))
                .sorted((s1, s2) -> s1.compareTo(s2))
                .skip(1)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .skip(1)
                .map(String::toUpperCase)
                //Print the result ???
                .count();

        return stream;

    }

}
