package edu.academy.jc.yarokhovich.hw4and5;

public class TestSqr {
    public static void main(String[] args) {
        Loops loops = new Loops();
        if (loops.getSqr(5)==25){
            System.out.println(loops.getSqr(5) + " good");
        }else System.out.println("bad");
        if (loops.getSqr(0)==1){//n is the degree, not sqr
            System.out.println(loops.getSqr(0) + " good");
        }else System.out.println("bad");
    }
}