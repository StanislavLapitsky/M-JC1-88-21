package edu.academy.jc.Gapaniuk.CW4;

import java.util.Random;

public class CW4_Gapaniuk {
    public static void main(String[] args) {

//        int[] arr = new int[10];
//        Random rand = new Random(20);
//        for (int i=0; i<arr.length;i++) {
//            arr[i] = rand.nextInt(10);
//            System.out.print(arr[i] + " ");
//        }
//        int max = arr[0];
//        int min = arr[0];
//        for (int i=1; i<arr.length;i++){
//            if (arr [i]>max) {
//                max=arr[i];
//            }
//            if (arr [i]<min) {
//                min=arr[i];
//            }
//
//        }
//        System.out.println();
//        System.out.println("min="+min);
//        System.out.println("max="+max);
//        String[] arrStr = new String[10];
//        Random rand = new Random(100);
//        for (int i = 0; i < arrStr.length; i++) {
//            arrStr[i] = Integer.toString(rand.nextInt(1000));
//            System.out.print(arrStr[i] + " ");
//        }
//        int max = arrStr[0].length();
//        int min = arrStr[0].length();
//        int maxInd = 0;
//        int minInd = 0;
//
//        for (int i = 1; i < arrStr.length; i++) {
//            if (arrStr[i].length() > max) {
//                max = arrStr[i].length();
//                maxInd = i;
//            }
//            if (arrStr[i].length() < min) {
//                min = arrStr[i].length();
//                minInd = i;
//            }
//
//        }
//
//        System.out.println();
//        System.out.println("max alement  - "+arrStr[maxInd]);
//        System.out.println("min alement  - "+arrStr[minInd]);
//        char [] minCh = new char[arrStr[minInd].length()];
//        char [] maxCh = new char[arrStr[maxInd].length()];
//        String minS = arrStr[minInd];
//        String maxS = arrStr[maxInd];
////        "abc".toCharArray()[1]
////        String s = s + "abc".toCharArray()[1];
////        maxS.toCharArray()[0]
//        for(int i=0; i<arrStr[minInd].length();i++){
//            minCh[i]=minS.toCharArray()[i];
//
//        }
//        for(int i=0; i<arrStr[maxInd].length();i++){
//
//            maxCh[i]=maxS.toCharArray()[i];
//
//        }
//        System.out.println();
//
//        for (char i:minCh){
//        System.out.print(i);}
//
//        System.out.println();
//
//        for (char i:maxCh) {
//            System.out.print(i);
//        }
//
//
//        int[][] arr2 = new int[10][2];
//        Random rand = new Random(100);
//        int sum = 0;
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 2; j++) {
//                arr2[i][j] = rand.nextInt(100);
//                sum += arr2[i][j];
//                System.out.print(arr2[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Sum=" + sum);
       CW4_Gapaniuk E4 = new CW4_Gapaniuk();
        System.out.println(E4.getSum(3));



     }

        public int getSum ( int n)
        {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if ((sum+i)<=100) {
                    sum += i;
                }
                else break;

            }
            return sum;
        }



}
