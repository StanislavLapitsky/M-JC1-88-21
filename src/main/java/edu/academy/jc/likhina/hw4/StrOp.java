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

        char vol;
        char lit;

        for (int i = 0; i < s.length(); i++) {
            vol = s.charAt(i);
            if (!Character.isDigit(vol)) {
                lit = vol;
                str.append(lit);
            }

            if (Character.isDigit(vol)) {

                int num = Character.getNumericValue(vol);

                for (int k = 1; k < num; k++) {
                  //Please help more, I do not understand how to display and add up exactly the characters from the upcoming position in the array
                }

            }

        }

        return str.toString();

    }
}



