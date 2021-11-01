package edu.academy.jc.gapaniuk.hw8i9;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        String s = "aaabccbbba";
        for (Map.Entry<Character, Integer> entry : getCharsCount(s).entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

    }

    public static Map<Character, Integer> getCharsCount(String s) {
        Map<Character, Integer> rez = new HashMap<>();
        Character[] chars = new Character[s.length()];
        int l = s.length();
        for (int i = 0; i < l; i++) {
            chars[i] = s.charAt(i);
        }
        Character cc;
        Set<Character> set1 = new HashSet<Character>(Arrays.asList(chars));
        Iterator<Character> iter = set1.iterator();
        int j = 0;
        while (iter.hasNext()) {
            cc = iter.next();
            j = 0;
            for (int i = 0; i < l; i++) {
                if (chars[i] == cc) {
                    j += 1;
                }
            }
            rez.put(cc,j);

        }

        return rez;

    }
}
