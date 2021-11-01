package edu.academy.jc.gapaniuk.hw10i11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PBTest {
    public static void main(String[] args) throws IOException {

        PhoneBookImpl PhoneBook1 = new PhoneBookImpl();
        PhoneBookImpl PhoneBook2 = new PhoneBookImpl();

        PhoneBook1.addUser(123,"Sergey");
        PhoneBook1.addUser(125,"Maria");
        PhoneBook1.addUser(256,"Andrey");
        PhoneBook1.addUser(759,"Sveta");
        System.out.println(PhoneBook1.getNameByNumber(256));
        System.out.println(PhoneBook1.getNumberByName("Maria"));
        File pbFile = new File("d:/","pb.txt");

        PhoneBook1.storeToFile(pbFile);
        PhoneBook2.loadFromFile(pbFile);

        System.out.println(PhoneBook2.getNumberByName("Maria"));









    }
}
