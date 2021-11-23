package edu.academy.jc.nesteruk.hw15;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5"));

        myList.removeIf(s -> s.charAt(1) == '3');
        System.out.println(myList);

        myList.sort(Comparator.comparing(s -> s.charAt(1)));
        System.out.println(myList);

        myList.sort(Collections.reverseOrder());
        System.out.println(myList);

        myList.removeIf(s -> s == myList.get(0) || s == myList.get(myList.size() - 1));
        System.out.println(myList);

        myList.replaceAll(String::toUpperCase);
        System.out.println(myList);

        System.out.println(myList.size());
    }
}
