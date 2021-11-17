package edu.academy.jc.nesteruk.hw11.mian;

import edu.academy.jc.nesteruk.hw11.dao.PhoneBook;
import edu.academy.jc.nesteruk.hw11.dao.impl.PhoneBookImpl;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        PhoneBook phoneBook = PhoneBookImpl.getInstance();
        phoneBook.addUser("Ivan", 123);
        phoneBook.addUser("Petr", 345);
        phoneBook.storeToFile(new File("phonebook.txt"));

        PhoneBook phoneBook2 = PhoneBookImpl.getInstance();
        phoneBook2.loadFromFile(new File("phonebook.txt"));

        if (phoneBook.getNameByNumber(123).equals("Ivan")){
            System.out.println("Exactly Name!");
        } else System.out.println("Wrong Name!");

        if (phoneBook.getNumberByName("Petr") == 345){
            System.out.println("Exactly Number!");
        } else System.out.println("Wrong Number!");
  }
}
