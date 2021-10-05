package edu.academy.jc.gapaniuk.cw7;

public class CalculateImpl1 implements Calculate {
    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public int divide(int a, int b) {
        return a/b;
    }
}
