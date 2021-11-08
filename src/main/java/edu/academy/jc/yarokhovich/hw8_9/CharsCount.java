package edu.academy.jc.yarokhovich.hw8_9;

import java.util.HashMap;
import java.util.Map;

public class CharsCount {
    public Map<Character, Integer> getCharsCount(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        char[] chars;
        chars = s.toCharArray();

        for(int i=0; i<chars.length;i++)
        {
            if(!map.containsKey(chars[i]))
            {
                map.put(chars[i], 0);
            }
            map.put(chars[i], map.get(chars[i])+1);
        }
        System.out.println(map.toString());
        return null;
    }

}
