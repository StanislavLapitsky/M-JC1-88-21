package edu.academy.jc.metlushko.ht13;
/*
* This is task 4 not right working
* */
public class MyCheckClass {
    public static void main(String[] args) throws Exception {
        MyThreadFactory mtf=new MyThreadFactory();
        Thread G=mtf.create(mtf.GENERATOR);
        Thread S=mtf.create(mtf.SUMACCUMULATOR);

        G.start();
        S.join();
        S.start();
    }
}
