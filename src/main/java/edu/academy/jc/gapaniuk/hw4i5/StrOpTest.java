package edu.academy.jc.gapaniuk.hw4i5;

public class StrOpTest {
    public static void main(String[] args) {
        strTest1();
        strTest2();
        strTest3();
    }
    private static void strTest3(){
        StrOp s1 = new StrOp();
        if (!s1.repeatPartOfString("ab3rdfd").equals("abababrdfd")) {
            System.out.println("error 1");
        }
        if (!s1.repeatPartOfString("ab10").equals("abababababababababab")) {
            System.out.println("error 2");
        }
        if (!s1.repeatPartOfString("12abc3h12").equals("abcabcabchhhhhhhhhhhh")) {
            System.out.println("error 3");
        }

    }
    private static void strTest2(){
        StrOp s1 = new StrOp();
        if (!s1.repeatChars("a3").equals("aaa")) {
            System.out.println("error 1");
        }
        if (!s1.repeatChars("f2h3").equals("ffhhh")) {
            System.out.println("error 2");
        }
        if (!s1.repeatChars("f2kr1h3t0ryu").equals("ffkrhhhryu")) {
            System.out.println("error 3");
        }
        if (!s1.repeatChars("1g11hh").equals("g1hh")) {
            System.out.println("error 4");
        }
        if (!s1.repeatChars("tt45t").equals("ttttt44444t")) {
            System.out.println("error 5");
        }
        if (!s1.repeatChars("tt45").equals("ttttt44444")) {
            System.out.println("error 6");
        }
        if (!s1.repeatChars("sa3db2c0f").equals("saaadbbf")) {
            System.out.println("error 7");
        }



    }

    private static void strTest1() {
        StrOp s1 = new StrOp();

        if (!s1.removeNumders("1bg3hh1bb23 hfh").equals("bghhbb hfh")) {
            System.out.println("error 1");
        }
        if (!s1.removeNumders("fffbghfh").equals("fffbghfh")) {
            System.out.println("error 2");
        }
        if (!s1.removeNumders("111111").equals("")) {
            System.out.println("error 3");
        }
        if (!s1.removeNumders("a11f11r").equals("afr")) {
            System.out.println("error 4");
        }

    }
}
