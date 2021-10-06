package edu.academy.jc.metlushko.lessons8;

public class GetMax {
    public static void main(String[] args) {

        System.out.println(GetMaxTest.getMaxCheck(-2,-924585342));
        System.out.println(GetMaxTest.getMaxCheck(-924585342,-2));
        System.out.println(GetMaxTest.getMaxCheck(924585342,-2));
        System.out.println(GetMaxTest.getMaxCheck(-924585342,2));
        System.out.println(GetMaxTest.getMaxCheck(924585342,2));
        System.out.println(GetMaxTest.getMaxCheck(2,924585342));
        System.out.println(GetMaxTest.getMaxCheck(2,2));
        System.out.println(GetMaxTest.getMaxCheck(-2,-2));

    }

    public static int getMax(int a, int b) {
        if(a==b){
            return 0;
        }
        int c=a-b;
        int i=Integer.toBinaryString(c).length();
        String string=""+Integer.toBinaryString(c);
        int index=Integer.parseInt(string.substring(0,1));

        if(32 == i && index==1){
            return b;
        }
        return a;
    }

}
