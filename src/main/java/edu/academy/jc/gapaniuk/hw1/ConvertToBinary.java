package edu.academy.jc.gapaniuk.hw1;

public class ConvertToBinary {
    public static void main(String[] args) {

        //test numbers
        int[] testNumbers = new int[]{0, 10, 1, 8, 65, 255};
        //go through the test numbers array
        for (int i = 0; i < testNumbers.length; i++) {
            //each number convert to binary
            String binaryString = toBinary2(testNumbers[i]);
            //compare converter results with correct result
            if (!Integer.toBinaryString(testNumbers[i]).equals(binaryString)) {
                //incorrect result is printed and program stops
                System.out.println("Incorrect converting of " + testNumbers[i]);
                System.out.println("Expected: " + Integer.toBinaryString(testNumbers[i]));
                System.out.println("Actual: " + binaryString);
                break;
            } else {
                System.out.print("In decimal notation " + testNumbers[i]);
                System.out.println("  in binary notation  " + binaryString);
            }
        }
        System.out.println("Successfully executed");
    }

    public static String toBinary(int n) {
        String binStr = "";
        if (n == 0) {
            return "0";
        }
        while (n > 0) {
            binStr = Integer.toString(n % 2) + binStr;
            n = n / 2;
        }
        return binStr;
    }

    public static String toBinary2(int n) {
        String sign = "";

        StringBuilder binStr2 = new StringBuilder();
        if (n == 0) {
            return "0";
        }
        if (n<0){
            n=Math.abs(n);
            sign= "-";
        }
        while (n > 0) {

            binStr2.append(Integer.toString(n % 2));
            n = n / 2;
        }
        return (sign+binStr2.reverse().toString());
    }
}
