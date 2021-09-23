package edu.academy.jc.Gapaniuk.CW5.math;

public class Test {
    public int getHyp(int k1, int k2){
        double a = Math.sqrt(Math.pow(k1,2)+Math.pow(k2,2));
        return (int) Math.round(a);
    }
    public boolean isPalindrom(String word){


        for (int i=0; i<(word.length()/2);i++){
            if (word.charAt(i)!=word.charAt(word.length()-i-1)){
                return false;
            }
        }
            return true;
    }

}
