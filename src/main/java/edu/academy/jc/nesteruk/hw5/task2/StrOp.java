package edu.academy.jc.nesteruk.hw5.task2;

public class StrOp {

    public String removeNumbers(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '0' && ch != '1' && ch != '2' && ch != '3' && ch != '4' && ch != '5' && ch != '6' && ch != '7' && ch != '8' && ch != '9') {
                str += Character.toString(ch);
            }
        }
        return s = str;
    }

    public String repeatChars(String s) {

        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '0' && ch != '1' && ch != '2' && ch != '3' && ch != '4' && ch != '5' && ch != '6' && ch != '7' && ch != '8' && ch != '9') {
                str += Character.toString(ch);
            }

            if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9') {
                if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2' || s.charAt(i - 1) == '3' || s.charAt(i - 1) == '4' || s.charAt(i - 1) == '5' || s.charAt(i - 1) == '6' || s.charAt(i - 1) == '7' || s.charAt(i - 1) == '8' || s.charAt(i - 1) == '9') {
                    int dec = (s.charAt(i - 1) - '0') * 10;
                    int number = (dec + (s.charAt(i) - '0'));
                    for (int k = 0; k < number - 1; k++) {
                        str += s.charAt(i - 2);
                    }
                }
            }

            if (s.charAt(i) == '0') {
                ch = s.charAt(i - 1);
                String replace = Character.toString(ch);
                str = str.replace(replace, "");
            }
            if (s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9') {
                if (s.charAt(i - 1) != '1' || s.charAt(i - 1) != '2' || s.charAt(i - 1) != '3' || s.charAt(i - 1) != '4' || s.charAt(i - 1) != '5' || s.charAt(i - 1) != '6' || s.charAt(i - 1) != '7' || s.charAt(i - 1) != '8' || s.charAt(i - 1) != '9') {
                    int test = s.charAt(i) - '0';
                    for (int j = 0; j < test - 1; j++) {
                        str += s.charAt(i - 1);
                    }
                }
            }

        }
        return str;
    }
}