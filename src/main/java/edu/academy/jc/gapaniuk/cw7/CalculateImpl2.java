package edu.academy.jc.gapaniuk.cw7;

public class CalculateImpl2 implements Calculate{
    @Override
    public int multiply(int a, int b) {
        int rez=0;

        for (int i=1; i<=b;i++){
            rez+=a;
        }
        return rez;
    }

    @Override
    public int divide(int a, int b) {
        int rez=0;
        if (a<b){
            return 0;
        }
        else {
            while (a > 0) {
                rez += 1;
                a = a - b;
            }
                return rez;
        }
    }
}
