package edu.academy.jc.metlushko.ht11;

import java.io.File;

public class PhoneBookDemo {
    public static void main(String[] args) {
        File myFile = new File("src/it/ht11iostreams/phoneBookFile.txt");

        PhoneBook phoneBookOne = new MyPhone();
        phoneBookOne.addUser("Artem", 293947710);
        phoneBookOne.addUser("Olga", 298745213);
        phoneBookOne.addUser("Marina", 298745632);
        phoneBookOne.addUser("Artem", 293978911);
        phoneBookOne.storeToFile(myFile);
        phoneBookOne.loadFromFile(myFile);
        System.out.println(phoneBookOne.getPb());

        PhoneBook phoneBookTwo = new MyPhone();
        phoneBookTwo.addUser("Sergey", 293544916);
        phoneBookTwo.addUser("Ludmila", 291028836);
        phoneBookTwo.addUser("Marina", 298745632);
        phoneBookTwo.addUser("Oleg", 294785213);
        phoneBookTwo.storeToFile(myFile);
        phoneBookTwo.loadFromFile(myFile);
        System.out.println(phoneBookTwo.getPb());

        System.out.println(phoneBookOne.getNameByNumber(293947710));
        System.out.println(phoneBookOne.getNumberByName("Marina") );

        System.out.println();
        System.out.println(phoneBookOne.getNumberByName("454"));
        System.out.println(phoneBookOne.getNameByNumber(223));
        phoneBookOne.storeToFile(new File("/asd"));





    }
}
