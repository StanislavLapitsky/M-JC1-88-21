package edu.academy.jc.likhina.hw10and11;

import java.io.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class MyPhoneBook implements PhoneBook {
    private final HashMap<String, Integer> phoneBookMap = new HashMap<>();

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
        String key = "There is no user with this number ";
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
        FileWriter writer = null;
        try {
            writer = new FileWriter(phoneBookFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert writer != null;
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        for (Entry<String, Integer> entry : phoneBookMap.entrySet()) {
            try {
                bufferedWriter.write(entry.getKey() + ";" + entry.getValue() + ";" + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            bufferedWriter.close();
            writer.close();
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
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] arrStr = line.split(";");
                    if (!line.equals("")) {
                        try {
                            phoneBookMap.put(arrStr[0],Integer.parseInt(arrStr[1]));
                        }catch (NumberFormatException | NullPointerException e){
                            System.out.println("Invalid data format");
                        }
                    }
                }
                System.out.println(phoneBookMap);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    assert reader != null;
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) throws Exception {

        PhoneBook phoneBook1 = new MyPhoneBook();
        PhoneBook phoneBook2 = new MyPhoneBook();

        phoneBook1.addUser("Andrey", 293593817);
        phoneBook1.addUser("Sveta", 253697814);
        phoneBook1.addUser("Sasha", 447896541);
        phoneBook1.addUser(null, 45654855);
        phoneBook1.addUser("Sasha", 954887444);
        phoneBook1.addUser("Karl", 123456789);
        phoneBook1.addUser("", 1445646565);
        phoneBook2.addUser("Nikita", 4544);


        phoneBook1.storeToFile(new File("D:/phoneBook1.txt"));
        phoneBook2.storeToFile(new File("D:/phoneBook2.txt"));

        phoneBook1.loadFromFile(new File("D:/phoneBook1.txt"));
        phoneBook2.loadFromFile(new File("D:/phoneBook2.txt"));

        System.out.println(phoneBook1.getNumberByName("Sveta") == 253697814);
        System.out.println(phoneBook1.getNumberByName("Sasha") == 954887444);
        System.out.println(phoneBook1.getNumberByName("ksdcmskdm") == 1445646565);
        System.out.println(phoneBook2.getNumberByName("Nikita") == 4544);

        System.out.println(phoneBook2.getNameByNumber(4544).equals("Nikita"));
        System.out.println(phoneBook1.getNameByNumber(293593817).equals("Andrey"));
        System.out.println(phoneBook1.getNameByNumber(29359381).equals("Andrey"));

    }
}
