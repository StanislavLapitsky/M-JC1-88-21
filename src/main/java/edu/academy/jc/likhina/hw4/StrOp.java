package edu.academy.jc.likhina.hw4;

public class StrOp {
    public static void main(String[] args) {
        String s = "abc12ed9fg0";
        StrOp str = new StrOp();
        System.out.println(str.removeNumbers(s));
        System.out.println(str.repeatChars("sa3db2c0f"));
    }

    public String removeNumbers(String s) {
        char result;
        char[] chars = s.toCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i);
            if (!Character.isDigit(result)) {
                str.append(result);
            }
        }
        return str.toString();
    }

    public String repeatChars(String s) {
        char[] chars = s.toCharArray();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(chars[i]) && i != 0) {
                str.append(getCharInString(chars[i - 1], chars[i]));
            }
            else {
            str.append(chars[i]);
            }

        }
        return str.toString();

    }

    public static String getCharInString(char a,char b){
        StringBuilder s=new StringBuilder();
       int num= Character.getNumericValue(b);
        for(int k=1;k<num;k++){
            s.append(a);

        }
        return s.toString();
    }

}



