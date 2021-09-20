package edu.academy.jc.Gapaniuk.HW1;

import java.util.Arrays;

public class Hw1DifferentSortArray {
    public static void main(String[] args) {
        int[] arrForSort = new int[]{1, 5, 6, 8, 34, 2, 7};
        int[] tempArray =new int[]{0,0,0,0,0,0,0};

//        tempArray = arrForSort;
        for (int i = 0; i < arrForSort.length; i++) {
            System.out.print("  ");
            System.out.print(arrForSort[i]);
        }
        for (int i = 0; i < arrForSort.length; i++) {
            tempArray[i]=arrForSort[i];
        }
        System.out.println("");
        bubbleMinRight(tempArray);
        for (int i = 0; i < tempArray.length; i++) {
            System.out.print("  ");
            System.out.print(tempArray[i]);
        }
        System.out.println("");
        for (int i = 0; i < arrForSort.length; i++) {
            System.out.print("  ");
            System.out.print(arrForSort[i]);
        }
        System.out.println();
        for (int i = 0; i < arrForSort.length; i++) {
            tempArray[i]=arrForSort[i];
        }
        selectionSortLeft(tempArray);
        System.out.println(Arrays.toString(tempArray));



    }
    private static int[] bubbleMinRight(int[] tempArray ) {
        boolean b = true;
        int temp;
        while (b) {
            b = false;
            for (int i = 0; i < tempArray .length - 1; i++) {
                if (tempArray [i] < tempArray [i + 1]) {
                    temp = tempArray [i];
                    tempArray [i] = tempArray [i + 1];
                    tempArray [i + 1] = temp;
                    b = true;
                }
            }
        }
        return tempArray ;
    }
    private static int[] selectionSortLeft(int[] tempArray ) {
        int tempIndex;
        int temp;

                for (int i = 0; i < tempArray .length - 1; i++) {
                    tempIndex=i;
                    for(int j=i+1;j<tempArray.length;j++)
                if (tempArray [j] < tempArray [i]) {
                    tempIndex = j;

                }
                    if (i!=tempIndex){
                        temp=tempArray[i];
                        tempArray[i]=tempArray[tempIndex];
                        tempArray[tempIndex]=temp;
                    }
            }

        return tempArray ;
    }

}
