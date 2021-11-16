package edu.academy.jc.gapaniuk.hw10i11v2;

import java.io.File;

public class TestHW10v2 {
    public static void main(String[] args) {
        PhoneBookImpl phBook = new PhoneBookImpl();
        phBook.addUser(123, "Sergey");
        phBook.addUser(222, "Vika");
        phBook.addUser(156, "Masha");
        phBook.pathToFileWithPB = "d:/temp";
        phBook.fileWithPB = new File(phBook.pathToFileWithPB, "pb2.txt");
        System.out.println(phBook.getNameByNumber(124));
        System.out.println(phBook.getNumberByName("Masha"));
        phBook.storeToFile(phBook.fileWithPB);


        PhoneBookImpl phBook1 = new PhoneBookImpl();
        phBook1.pathToFileWithPB = "d:/temp";
        phBook1.fileWithPB = new File(phBook.pathToFileWithPB, "pb1.txt");
        phBook1.loadFromFile(phBook1.fileWithPB);
        System.out.println(phBook.getNumberByName("Vika"));


    }
}
