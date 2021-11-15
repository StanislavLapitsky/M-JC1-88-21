package edu.academy.jc.nesteruk.hw5.task2;

public class Test {
    public static void main(String[] args) {

        testRemoveNumbers("abcdef", "a2bc3d46ef");

        testRepeatChars("rrbbbtttt", "r2b3c0t4");
    }

    static void testRemoveNumbers(String test1, String s) {
        StrOp strOp = new StrOp();
        strOp.removeNumbers(s);

        if (test1.equals(strOp.removeNumbers(s))) {
            System.out.println("Тест прошел: " + "test " + test1 + " = " + "s: " + strOp.removeNumbers(s));
        } else {
            System.out.println("Тест не прошел");
        }
    }

    static  void  testRepeatChars (String test, String s){
        StrOp strOp = new StrOp();
        strOp.repeatChars(s);

        if (test.equals(strOp.repeatChars(s))){
            System.out.println("Тест прошел: " + "test " + test + " = " + "s: " + strOp.repeatChars(s));
        } else {
            System.out.println("Тест не прошел" + strOp.repeatChars(s));
        }
    }
}
