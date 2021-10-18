package edu.academy.jc.yarokhovich.hw4and5;

public class TestRemoveNumbers {
    public static void main(String[] args) {
        test1();
        test2();
    }
    public static void test1(){
        StrOp strOp = new StrOp();
        String s = "sa3db";
        String s2 = "sadb";
        if( strOp.removeNumbers(s).equals(s2)){
            System.out.println("test 1 good");
        } else {
            System.out.println("bad");
        }
    }
    public static void test2() {
        StrOp helper = new StrOp();
        if ("TCSTCS".equals(helper.removeNumbers("TCS187TCS111"))) {
            System.out.println("Good job");
        }
    }
}
