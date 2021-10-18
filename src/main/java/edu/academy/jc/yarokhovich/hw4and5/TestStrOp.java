package edu.academy.jc.yarokhovich.hw4and5;

public class TestStrOp {
    public static void main(String[] args) {
        StrOp helper = new StrOp();
        if ("187111".equals(helper.removeNumbers("TCS187TCS111"))) {
            System.out.println("Good job");
        }
    }
}
