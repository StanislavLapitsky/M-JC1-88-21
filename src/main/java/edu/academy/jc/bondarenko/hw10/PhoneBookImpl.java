package edu.academy.jc.bondarenko.hw10;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class PhoneBookImpl implements PhoneBook {
    private HashMap<Integer, String> book = null;

    public PhoneBookImpl() {
        book = new HashMap<>();
    }

    @Override
    public void addUser(String name, int number) {
        book.put(number, name);
    }

    @Override
    public int getNumberByName(String name) {
        try {
            for (Map.Entry<Integer, String> elem : book.entrySet()) {
                if (name.equals(elem.getValue())) {
                    return (elem.getKey());
                }
            }
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public String getNameByNumber(int number) {
        try {
            if (number > 0 && String.valueOf(number).length() > 2) {
                return book.get(number);
            }
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return "Name not found";
    }

    @Override
    public void storeToFile(File phoneBookFile) {
        try (FileWriter writer = new FileWriter(phoneBookFile, true)) {
            for (Map.Entry<Integer, String> elem : book.entrySet()) {
                String text = elem.getValue() + "," + elem.getKey() + "\r\n";
                writer.write(text);
            }
        } catch (FileNotFoundException ex2) {
            System.out.println("File not exist " + ex2.getMessage());
            ex2.printStackTrace();
        } catch (IOException ex) {
            System.out.println("My message: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Override
    public void loadFromFile(File phoneBookFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(phoneBookFile))) {
            String str;
            book.clear();
            while ((str = reader.readLine()) != null) {
                String[] user = str.split(",");
                try {
                    book.put(Integer.valueOf(user[1]), user[0]);
                } catch (NumberFormatException | IndexOutOfBoundsException e) {
                    System.out.println("My message loadFromFile: " + e.getMessage());
                    e.printStackTrace();
                }
            }
            System.out.println(book);
        } catch (IOException e) {
            System.out.println("My message loadFromFile: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
