package edu.academy.jc.yarokhovich.hw4and5;

public class StrOp {
    public String removeNumbers(String s){
        String str = s.trim();
        String digits="";
        for (int i = 0; i < str.length(); i++) {
            char chrs = str.charAt(i);
            if (Character.isDigit(chrs)==false)
                digits = digits.concat(String.valueOf(chrs));
        }
        return digits;
    }

    public String repeatChars(String s){
        char[] ch=s.toCharArray();
        StringBuilder builder= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(ch[i])&&i!=0){
                if (Character.getNumericValue(ch[i])==0){
                    builder.delete(i,++i);
                }
                builder.append(appendChars(ch[i-1],ch[i]));
            }
            else {
                builder.append(ch[i]);
            }
        }
        return builder.toString();
    }
    public static String appendChars(char ch, char n){
        StringBuilder s= new StringBuilder();
        for (int i = Character.getNumericValue(n); (i-1)>0; i--) {
            s.append(ch);
        }
        return s.toString();
    }
}
