package edu.academy.jc.gapaniuk.hw10i11;

import java.io.File;
import java.io.IOException;

public class PBTest {
    public static void main(String[] args) {

        PhoneBookExtend PhoneBook1 = new PhoneBookExtend();
        PhoneBookExtend PhoneBook2 = new PhoneBookExtend();

        PhoneBook1.addUser(123,"Sergey");
        PhoneBook1.addUser(125,"Maria");
        PhoneBook1.addUser(256,"Andrey");
        PhoneBook1.addUser(759,"Sveta");

        File pbFile = new File("d:/","pb.txt");

     //   PhoneBook1.storeToFile(pbFile);
        PhoneBook2.loadFromFile(pbFile);

        System.out.println(PhoneBook2.getNumberByName("Inna"));
        System.out.println(PhoneBook2.getNameByNumber(200));









    }
}
