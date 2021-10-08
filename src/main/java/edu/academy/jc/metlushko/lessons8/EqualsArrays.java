package edu.academy.jc.metlushko.lessons8;
import java.util.*;

public class EqualsArrays {
    public static void main(String[] args) {
        int [] arrays=generationRandomArray(new int[10],10);
        int [] arraysA = new int[arrays.length / 2];
        int [] arraysB = new int[arrays.length / 2];

        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
        System.out.println("Sum arrays: "+sumArray(arrays)+"\n");
        getEqualsArrays(arrays, arraysA, arraysB);
        System.out.println(Arrays.toString(arraysA));
        System.out.println("Sum arrays A: "+sumArray(arraysA)+"\n");
        System.out.println(Arrays.toString(arraysB));
        System.out.println("Sum arrays B: "+sumArray(arraysB));
    }

    public static int[] generationRandomArray(int[] n, int max) {
        Random random = new Random();
        for (int i = 0; i < n.length; i++) {
            n[i] = random.nextInt(max);
        }
        return n;
    }

    public static int sumArray(int[] n) {
        int sum = 0;
        for (int j : n) {
            sum += j;
        }
        return sum;
    }
    public static int getDifference(int a,int b){
        return (a-b)%2==1?(a-b-1)/2:(a-b)/2;

    }

    public static void getEqualsArrays(int [] n,int[] arraysA, int[] arraysB){
        System.arraycopy(n,0,arraysA,0,arraysA.length);
        System.arraycopy(n,5,arraysB,0,arraysA.length);
        for (int b = arraysB.length-1; b >0; b--) {
            for (int a = 0; a <arraysA.length; a++) {
                if(sumArray(arraysB)==sumArray(arraysA)){
                    return;
                }
                int dif=getDifference(sumArray(arraysB),sumArray(arraysA));
                if((arraysB[b]-arraysA[a])<=dif&&(arraysB[b]-arraysA[a])>0){
                    int p=arraysA[a];
                    arraysA[a]=arraysB[b];
                    arraysB[b]=p;
                    break;
                }
            }
        }
    }

}




