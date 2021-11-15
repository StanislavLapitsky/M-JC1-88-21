package edu.academy.jc.gapaniuk.hw10i11;

import java.io.File;
import java.io.IOException;

public class PBTest {
    public static void main(String[] args) {

        PhoneBookExtend phoneBook1 = new PhoneBookExtend();
        PhoneBookExtend phoneBook2 = new PhoneBookExtend();

        phoneBook1.addUser(123,"Sergey");
        phoneBook1.addUser(125,"Maria");
        phoneBook1.addUser(256,"Andrey");
        phoneBook1.addUser(759,"Sveta");

        File pbFile = new File("d:/","pb.txt");

        phoneBook1.storeToFile(pbFile);
        phoneBook2.loadFromFile(pbFile);

        System.out.println(phoneBook2.getNumberByName("Sergey"));
        System.out.println(phoneBook2.getNameByNumber(123));









    }
}
