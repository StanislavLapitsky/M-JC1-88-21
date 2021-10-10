package edu.academy.jc.metlushko.ht9;

import java.util.*;

public class MyMap {
    public static void main(String[] args) {
        System.out.println(getCharsCount("bbbaacccfff"));
    }

    public static Map<Character, Integer> getCharsCount(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hashmap.put(chars[i], i);
        }
        return hashmap;
    }
}
