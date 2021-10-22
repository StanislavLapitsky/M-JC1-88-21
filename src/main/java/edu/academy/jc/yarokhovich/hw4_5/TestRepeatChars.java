package edu.academy.jc.yarokhovich.hw4_5;

public class TestRepeatChars {
    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        StrOp strOp = new StrOp();
        String s = "sa3db2c0f";
        String s2 = "saaadbbf";
        strOp.repeatChars(s);
        if( strOp.repeatChars(s).equals(s2)){
            System.out.println("test 1 good");
        } else {
            System.out.println("bad");
        }
    }
}
