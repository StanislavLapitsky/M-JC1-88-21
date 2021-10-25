package edu.academy.jc.yarokhovich.hw8_9;

public class Main {
    public static void main(String[] args) {
        CharsCount charsCount = new CharsCount();
        String s = "baaccc";
        charsCount.getCharsCount(s);
        MyList lexa = new MyList(3);
        lexa.addElem(1);
        lexa.addElem(2);
        System.out.println(lexa);
        lexa.addElem(3);
        lexa.addElem(4);
        System.out.println(lexa);

    }
}
