package edu.academy.jc.bondarenko.hw10;

import java.io.File;

public class Main extends PhoneBookImpl{
    public static void main(String[] args) {
        PhoneBook ph1 = new PhoneBookImpl();
        ph1.addUser("Vova", 777);
        ph1.addUser("Oleg", 888);
        File f1 = new File("D:\\Java courses\\prictice\\M-JC1-88-21-all2\\src\\main\\java\\edu\\academy\\jc\\bondarenko\\hw10\\phoneBook.txt");
        ph1.storeToFile(f1);
        PhoneBook ph2 = new PhoneBookImpl();
        ph2.loadFromFile(new File("D:\\Java courses\\prictice\\M-JC1-88-21-all2\\src\\main\\java\\edu\\academy\\jc\\bondarenko\\hw10\\phoneBook.txt"));
        String name = ph2.getNameByNumber(777);
        if (name.equals("Name not found")){
            throw new NumberFormatException(name);
        }
        System.out.println("Name " + name +", "+ "number " + ph2.getNumberByName("Oleg"));

    }
}
