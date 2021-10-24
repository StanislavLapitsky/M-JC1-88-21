package edu.academy.jc.likhina.hw10and11;

import java.io.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class MyPhoneBook implements PhoneBook {
    private static final HashMap<String, Integer> phoneBookMap = new HashMap<>();



    @Override
    public void addUser(String name, int number) {
        if (name == null) {
            System.out.println("Name can't be NULL");
        } else if (name.length() == 0) {
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
            return phoneBookMap.get(name);
    }

    @Override
    public String getNameByNumber(int number) {
        String key = "";
        for (Entry<String, Integer> entry : phoneBookMap.entrySet()) {
            if (entry.getValue() == number) {
                key = entry.getKey();
                break;
            }
        }
        return key;
    }

    @Override
    public void storeToFile(File phoneBookFile) {
        try {
            try (FileWriter writer = new FileWriter(phoneBookFile)) {
                try (BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
                    for (Entry entry : phoneBookMap.entrySet())
                        bufferedWriter.write(entry.getKey() + ";" + entry.getValue() + ";" + "\n");
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void loadFromFile(File phoneBookFile) {

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(phoneBookFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (phoneBookFile.exists()) {
            try {
                String line = null;
                if (reader != null) {
                    line = reader.readLine();
                }
                String[] arrStr = new String[0];
                if (line != null) {
                    arrStr = line.split(";");
                }
                if (line != null && !line.equals("")) {
                    phoneBookMap.put(arrStr[0], Integer.valueOf(arrStr[1]));
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println(phoneBookMap);
            }
        }
    }


    public static void main(String[] args) {

        File phoneBookFile = new File("D:/PhoneBook.txt");
        //I don't understand how to create a new book with a new address(I understand that you need to change the address in the variable),
        // and it stopped writing to the file, shows that it is empty, but reads from it(busy file?)

        PhoneBook phoneBook1 = new MyPhoneBook();
        PhoneBook phoneBook2 = new MyPhoneBook();


        phoneBook1.storeToFile(phoneBookFile);
        phoneBook2.storeToFile(phoneBookFile);


        phoneBook1.addUser("Andrey", 293593817);
        phoneBook1.addUser("Sveta", 253697814);
        phoneBook1.addUser("Sasha", 447896541);
        phoneBook1.addUser(null, 45654855);
        phoneBook1.addUser("Sasha", 954887444);
        phoneBook1.addUser("Karl", 123456789);
        phoneBook1.addUser("", 1445646565);

        phoneBook2.addUser("Nikita", 4544);
        phoneBook1.loadFromFile(phoneBookFile);
        phoneBook2.loadFromFile(phoneBookFile);

        System.out.println(phoneBook1.getNumberByName("Sveta") == 253697814);
        System.out.println(phoneBook1.getNumberByName("Sasha") == 954887444);
        System.out.println(phoneBook1.getNumberByName("ksdcmskdm") == 1445646565);


        System.out.println(phoneBook1.getNameByNumber(293593817).equals("Andrey"));
        System.out.println(phoneBook1.getNameByNumber(29359381).equals("Andrey"));

    }
}
