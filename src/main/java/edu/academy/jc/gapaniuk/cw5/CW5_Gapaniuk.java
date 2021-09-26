package edu.academy.jc.gapaniuk.cw5;

import edu.academy.jc.gapaniuk.cw5.math.Test;

public class CW5_Gapaniuk {
    public static void main(String[] args) {
        Test t = new Test();
        edu.academy.jc.gapaniuk.cw5.str.Test t2 =new edu.academy.jc.gapaniuk.cw5.str.Test();
        System.out.println(t.getHyp(3,4));

        double b = 2.4+2.4;
        int i = (int) b;

        int i1 = (int) Math.round(b);
        String s = "vavav";
        System.out.println(i+" "+i1);
        System.out.println(s+"  is pali ? -  "+t2.isPalindrom(s) );
        System.out.println(t2.clearNumbersAndRotate("1a2bcd"));

    }

}
