package edu.academy.jc.gapaniuk.hw10i11v2;

import java.io.File;
import java.io.IOException;

public class TestHW10v2 {
    public static void main(String[] args) {
        MyPhoneBook phBook = new MyPhoneBook();
        phBook.addUser(123,"Sergey");
        phBook.addUser(222,"Vika");
        phBook.addUser(156,"Masha");
        phBook.pathToFileWithPB="d:/temp";
        phBook.fileWithPB = new File(phBook.pathToFileWithPB,"pb2.txt");
        System.out.println(phBook.getNameByNumber(123));
        System.out.println(phBook.getNumberByName("Vika"));
        try {
            phBook.storeToFile(phBook.fileWithPB);
        } catch (IOException e) {
            e.printStackTrace();
        }
        MyPhoneBook phBook1 = new MyPhoneBook();
        phBook1.pathToFileWithPB="d:/temp";
        phBook1.fileWithPB = new File(phBook.pathToFileWithPB,"pb1.txt");
        phBook1.loadFromFile(phBook1.fileWithPB);
        System.out.println(phBook.getNumberByName("Vika"));


    }
}
