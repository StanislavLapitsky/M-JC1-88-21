package edu.academy.jc.yarokhovich.hw4_5;

public class TestRemoveNumbers {
    public static void main(String[] args) {
        testBad();
        testGood();
    }
    public static void testBad(){
        StrOp strOp = new StrOp();
        String s = "sa3db";
        String s2 = "sadb";
        if( strOp.removeNumbers(s).equals(s2)){
            System.out.println("test 1 good");
        } else {
            System.out.println("bad");
        }
    }
    public static void testGood() {
        StrOp helper = new StrOp();
        if ("TCSTCS".equals(helper.removeNumbers("TCS187TCS111"))) {
            System.out.println("Good job");
        }
    }
}
