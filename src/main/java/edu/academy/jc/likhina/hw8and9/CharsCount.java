package edu.academy.jc.likhina.hw8and9;

import java.util.*;

public class CharsCount {
    public static void main(String[] args) {
        CharsCount test = new CharsCount();
        System.out.println(test.getCharsCount("abbccccdddddddd"));
    }

    public static Map<Character, Integer> getCharsCount(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(chars[i])) {
                count++;
            }
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], count);
                count = 1;
            }
            map.put(chars[i], count);
        }
        return map;
    }
}
