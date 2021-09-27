package edu.academy.jc.gapaniuk.hw1;

public class Subsequence10100 {
    public static void main(String[] args) {
        int ind = 11;
// 101001000100001
        System.out.print("Answer1 : ");
        System.out.println(findNumber1(ind));
        System.out.print("Answer2 : ");
        System.out.println(findNumber2(ind, 1, 2));


    }
    //algorithm with While
    public static int findNumber1(int index) {
        int i = 2;
        int currentNumber = 1;
        if (index == 1) {
            return 1;
        }
        while (currentNumber < index) {
            currentNumber = currentNumber + i;
            i++;
        }
        if (currentNumber == index) {
            return 1;
        } else {
            return 0;
        }
    }
    //algorithm with recursion
    public static int findNumber2(int index, int currentNumber, int step) {
        if (index > currentNumber) {
            return findNumber2(index, (currentNumber + step), step + 1);


        }
        if (currentNumber == index) {
            return 1;

        }

        return 0;


    }
}