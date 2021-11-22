package edu.academy.jc.nesteruk.hw11.dao.impl;

import edu.academy.jc.nesteruk.hw11.dao.PhoneBook;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneBookImpl implements PhoneBook {
    private final HashMap<Integer, String> mapPhoneBook = new HashMap<>();

    private static final PhoneBook instance = new PhoneBookImpl();

    private PhoneBookImpl (){}

    public static PhoneBook getInstance() {
        return instance;
    }


    @Override
    public void addUser(String name, int number) throws IOException{
        try {

            mapPhoneBook.put(number, name);
        } catch (Exception e) {
            throw new IOException("name not found");
        }
    }

    @Override
    public int getNumberByName(String name) throws IOException{
        try {

            for (Map.Entry entry : mapPhoneBook.entrySet()) {
                if (Objects.equals(name, entry.getValue())) {
                    return (int) entry.getKey();
                }
            }
            return 0;
        } catch (Exception e) {
            throw new IOException("number not found");
        }
    }

    @Override
    public String getNameByNumber(int number) {
        return mapPhoneBook.get(number);
    }

    @Override
    public void storeToFile(File phoneBookFile) throws Exception{
        try {

            FileWriter fw = new FileWriter(phoneBookFile);
            for (Map.Entry entry : mapPhoneBook.entrySet()) {
                Integer key = (Integer) entry.getKey();
                String value = (String) entry.getValue();
                fw.write(key + ", " + value + "\n");
            }

        } catch (IOException e) {
            throw new IOException("cannot be saved to file");
        }
    }

    @Override
    public void loadFromFile(File phoneBookFile) throws IOException {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(phoneBookFile));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null){
                if (line != "\n"){
                    stringBuilder.append(line);
                } else {
                    String[] temp = stringBuilder.toString().split(", ");
                    mapPhoneBook.put(Integer.parseInt(temp[0]),temp[1]);
                    stringBuilder = new StringBuilder();
                }
            }

            reader.close();

        } catch (IOException e) {
            throw new IOException("cannot be loaded from file");
        }
    }
}
