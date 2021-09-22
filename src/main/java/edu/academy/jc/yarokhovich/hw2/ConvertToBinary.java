package edu.academy.jc.yarokhovich.hw2;

public class ConvertToBinary {

    public static void main(String[] args) {

        //test numbers
        int[] testNumbers = new int[]{0, 1, 8, 65, 255};
        //go through the test numbers array
        for (int i = 0; i < testNumbers.length; i++) {
            //each number convert to binary
            String binaryString = toBinary(i);
            //compare converter results with correct result
            if (!Integer.toBinaryString(i).equals(binaryString)) {
                //incorrect result is printed and program stops
                System.out.println("Incorrect converting of " + i);
                System.out.println("Expected: " + Integer.toBinaryString(i));
                System.out.println("Actual: " + binaryString);
                break;
            }
        }
        System.out.println("Successfully executed");


    }

    private static String toBinary2(int n) {//простой метод;-)
        return Integer.toString(n, 2);
    }

    private static String toBinary(int n) {//нормальный метод ;-)
        int b;
        String temp = "";
        while (n != 0) {
            b = n % 2;
            temp = b + temp;
            n = n / 2;
        }
        return temp;
    }
}

