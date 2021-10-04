package edu.academy.jc.bondarenko.hw1;

import java.util.Scanner;

public class StrOp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StrOp str = new StrOp();
        System.out.println("Please, enter the string ");
        String s = in.nextLine();
        str.removeNumbers(s);
        System.out.println();
    }

    public void removeNumbers(String s) {
        System.out.println(s.replaceAll("[0-9]", ""));
    }

    public void repeatChars(String s) {
    }
}
