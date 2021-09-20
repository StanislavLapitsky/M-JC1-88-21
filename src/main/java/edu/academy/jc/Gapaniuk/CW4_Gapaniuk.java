package edu.academy.jc.Gapaniuk;

import java.util.Random;

public class CW4_Gapaniuk {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random(20);
        for (int i=0; i<arr.length;i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        int max = arr[0];
        int min = arr[0];
        for (int i=1; i<arr.length;i++){
            if (arr [i]>max) {
                max=arr[i];
            }
            if (arr [i]<min) {
                min=arr[i];
            }

        }
        System.out.println();
        System.out.println("min="+min);
        System.out.println("max="+max);
    }


}
