package edu.academy.jc.yarokhovich.hw10_11;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBookImpl();
        phoneBook.addUser("Ivan", 1234);
        phoneBook.addUser("Petr", 3456);
        File f1 = new File("D:\\phoneBook.txt");
        phoneBook.storeToFile(f1);
        PhoneBook phoneBook2 = new PhoneBookImpl();
        phoneBook2.loadFromFile(new File("D:\\phoneBook.txt"));
        String name = phoneBook2.getNameByNumber(3456);
        if (name.equals("Incorrect name")){
            throw new NumberFormatException(name);
        }
        System.out.println(" name " + name + " number " + phoneBook2.getNumberByName("Petr"));

    }
}
