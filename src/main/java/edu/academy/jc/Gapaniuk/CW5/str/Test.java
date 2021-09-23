package edu.academy.jc.Gapaniuk.CW5.str;

public class Test {
    public boolean isPalindrom(String word){


        for (int i=0; i<(word.length()/2);i++){
            if (word.charAt(i)!=word.charAt(word.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public String clearNumbersAndRotate(String word){
        StringBuilder resStr = new StringBuilder();

        for (int i =(word.length()-1);i>=0;i--){
            if (!(Character.isDigit(word.charAt(i)))) {
                resStr.append(word.charAt(i));
            }

            }

        return resStr.toString();
    }
}
