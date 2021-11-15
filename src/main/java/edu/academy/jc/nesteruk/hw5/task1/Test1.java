package edu.academy.jc.nesteruk.hw5.task1;

import java.util.stream.IntStream;

public class Test1 {
    public static void main(String[] args) {
        Loops loops = new Loops();

        testSqr(3, 3); // Test #1: в "tes1" введите то же число, что и в "n"

        int a[] = {414, 3, 5}; // Введите тестовый массив
        int b[] = {1, 0, 3, 1}; // Введите тестовый массив
        int c[] = {0, 9, 32}; // Введите тестовый массив
        testMaxSumArray(a, b, c); // Test #2

        int[] d = {1234, 56, 789};
        testRotateNumbers(d); // Test #3
    }

    static void testSqr(int n, int test1) {
        Loops loops = new Loops();
        loops.getSqr(n);
        test1 = (int) Math.pow(test1, 2); // Метод находит квадрат числа

        if (loops.getSqr(n) == test1) {
            System.out.println("Тест #1 пройден");
        } else {
            System.out.println("Тест #1 не прошел");
        }
    } // Test #1

    static void testMaxSumArray(int[] a, int[] b, int[] c) {
        Loops loops = new Loops();
        loops.getMaxSumArray(a, b, c);
        int res = 0;

        int total1 = IntStream.of(a).sum(); // Метод находит сумму значений в массиве
        int total2 = IntStream.of(b).sum();
        int total3 = IntStream.of(c).sum();

        if (total1 > total2 && total1 > total3) {
            res = 1;
        } else if (total2 > total1 && total2 > total3) {
            res = 2;
        } else if (total3 > total1 && total3 > total2) {
            res = 3;
        }

        if (res == loops.getMaxSumArray(a, b, c)) {
            System.out.println("Тест #2 пройден");
        } else {
            System.out.println("Тест #2 не прошел");
        }
    } // Test #2

    static void testRotateNumbers(int[] d) {
        Loops loops = new Loops();
        loops.rotateNumbers(d);

        int finalTest = 0;
        int[] result = new int[d.length];

        for (int i = 0; i < d.length; i++) {
            while (d[i] != 0) {
                result[i] += d[i] % 10;
                d[i] = (d[i] - d[i] % 10) / 10;
                if (d[i] % 10 == 0) {
                    break;
                }
                result[i] *= 10;
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] == loops.rotateNumbers(d)[i]) {
                finalTest++;
            }
        }
        if (finalTest == result.length) {
            System.out.println("Тест #3 пройден");
        } else {
            System.out.println("Тест #3 не прошел");
        }
    } // Test #3


}
