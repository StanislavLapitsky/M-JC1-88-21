package edu.academy.jc.likhina.hw10and11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyPhoneBook implements PhoneBook {
    private static HashMap<String, Integer> phoneBookMap = new HashMap<>();

    @Override
    public void addUser(String name, int number) {
        if (name == null) {
            System.out.println("Name can't be NULL");
        } else if (name == "") {
            System.out.println("Name can't be empty");
        } else if (phoneBookMap.containsKey(name)) {
            System.out.println("A contact with this name already exists");
        } else {
            phoneBookMap.put(name, number);
            System.out.println("Successfully added");
        }
    }

    @Override
    public int getNumberByName(String name) {
        if (!phoneBookMap.containsKey(name)) {
            System.out.println("There is no contact with that name");
            return 0;
        } else
            System.out.println(name+" == "+phoneBookMap.get(name));
        return 1;
        //is it necessary to get values from the phonebook text file here?
    }

    @Override
    public String getNameByNumber(int number) {
        if(!phoneBookMap.containsValue(number)){
            System.out.println("There is no contact with this number!");
        }
            return null;
        //please help me how to get the key value?
    }

    @Override
    public void storeToFile(File phoneBookFile) {
        try {
            FileWriter writer = new FileWriter(phoneBookFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Map.Entry entry : phoneBookMap.entrySet()) {
                bufferedWriter.write(entry.getKey() + ";" + entry.getValue() + ";" + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void loadFromFile(File phoneBookFile) {
//please help, I don't understand on what principle and how it should work?
    }

    public static void main(String[] args) {
        File phoneBookFile = new File("D:/phoneBookFile.txt");
        PhoneBook phoneBook = new MyPhoneBook();
        phoneBook.addUser("Andrey", 293593817);
        phoneBook.addUser("Sveta", 253697814);
        phoneBook.addUser("Sasha", 447896541);
        phoneBook.addUser(null, 45654855);
        phoneBook.addUser("Sasha", 954887444);
        phoneBook.addUser("Karl", 123456789);
        phoneBook.addUser("", 1445646565);

        phoneBook.storeToFile(phoneBookFile);
        phoneBook.getNumberByName("Sveta");
        phoneBook.getNumberByName("Sasha");
        phoneBook.getNumberByName("ksdcmskdm");
    }
}
