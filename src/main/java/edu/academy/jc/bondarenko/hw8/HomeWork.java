package edu.academy.jc.bondarenko.hw8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HomeWork hw = new HomeWork();
        System.out.println("Enter the string");
        String s = in.nextLine();
        System.out.println("The result: ");
        System.out.println(hw.getCharsCount(s));
    }

    public Map<Character, Integer> getCharsCount(String s) {
        int counter = 0;
        Map<Character, Integer> m1 = new HashMap();
        char[] arr = s.toCharArray();
        for (int j = 0; j < s.length() - 1; ) {
            for (int i = j + 1; i < s.length(); i++) {
                if (arr[j] == arr[i]) {
                    counter++;
                }
            }
            if (!m1.containsKey(arr[j])) {
                m1.put(arr[j], counter + 1);
            }
            j++;
            counter = 0;
        }
        return m1;
    }
}
