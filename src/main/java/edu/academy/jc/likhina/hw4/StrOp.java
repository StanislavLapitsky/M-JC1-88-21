package edu.academy.jc.likhina.hw4;

public class StrOp {
    public static void main(String[] args) {
        String s = "abc12ed9fg0";
        StrOp str = new StrOp();
        System.out.println(str.removeNumbers(s));
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
    public String repeatChars(String s){
        StringBuilder str=new StringBuilder();
        char res;
        char[] chars = s.toCharArray();
        for(int i =0;i<s.length();i++){
            res=s.charAt(i);
            if (Character.isDigit(res)) {

                //I don't know what to do next, help
            }
        }
        return s;
    }
}



