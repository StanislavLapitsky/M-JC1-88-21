package edu.academy.jc.yarokhovich.hw8_9;

public class Main {
    public static void main(String[] args) {
        CharsCount charsCount = new CharsCount();
        String s = "baaccc";
        charsCount.getCharsCount(s);
        MyList lexa = new MyList(3);
        lexa.add(1);
        lexa.add(2);
        System.out.println(lexa);
        lexa.add(3);
        lexa.add(4);
        System.out.println(lexa);

    }
}
