package edu.academy.jc.metlushko.ht4;


public class StrOp {
    public static void main(String[] args) {
        StrOpTest.checkRemoveNumbers("23qwe324ersdf435  345 ret fdg ");
        StrOpTest.checkrepeatChars("1aas2qwe3ghj4","1aassqweeeghjjjj");
        StrOpTest.checkrepeatCharsHard("1ab3zxc4","1abababzxcxcxcxc");


    }

    public static String removeNumbers(String s){
        char[] chars=s.toCharArray();
        StringBuilder str= new StringBuilder();
        for (char aChar : chars) {
            if (!Character.isDigit(aChar)) {
                str.append(aChar);
            }
        }
        return str.toString();
    }

    public static String repeatChars(String s){
        char[] chars=s.toCharArray();
        StringBuilder stringBuilder= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(chars[i])&&i!=0){
                stringBuilder.append(checkCharIsDigit(chars[i-1],chars[i]));
            }
            else {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
    public static String checkCharIsDigit(char ch,char n){
        StringBuilder s= new StringBuilder();
        for (int k=n-'0'; (k-1)>0; k--) {
            s.append(ch);
        }

        return s.toString();
    }

    public static String repeatCharsHard(String s){
        char[] chars=s.toCharArray();
        StringBuilder stringBuilder= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(chars[i])&&i!=0&&i!=1){
                stringBuilder.append(checkCharIsDigitHard(chars[i-2],chars[i-1],chars[i]));
            }
            else {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
    public static String checkCharIsDigitHard(char ch1,char ch2,char n){
        StringBuilder s= new StringBuilder();
        for (int k=n-'0'; (k-1)>0; k--) {
            s.append(ch1).append(ch2);
        }
        return s.toString();
    }

}
