package edu.academy.jc.metlushko.lesson4;

import java.util.Arrays;

public class StarTest {
    public static void checkStar(int []arrays,int[]result){
        Arrays.sort(arrays);
        Arrays.sort(result);
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i]!=result[i]){
                System.out.println("Not right working!");
                return;
            }
        }
        System.out.println("All right in method ");
    }
}



