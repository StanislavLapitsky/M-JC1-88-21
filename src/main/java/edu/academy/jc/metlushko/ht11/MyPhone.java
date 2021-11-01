package edu.academy.jc.metlushko.ht11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MyPhone implements PhoneBook {
    private File phoneBookFile = null;
    private String address = "src/com/ht11/phoneBookFile.txt";
    private HashMap<Integer, String> pb = new HashMap<>();

    @Override
    public void addUser(String name, int number) {
        pb.put(number, name);
    }

    @Override
    public int getNumberByName(String name) {
        for (Map.Entry<Integer, String> k : pb.entrySet()) {
            if (name.equals(k.getValue())) {
                return (k.getKey());
            }
        }
        return 0;
    }

    @Override
    public String getNameByNumber(int number) {
        int num = Integer.parseInt(String.valueOf(number));
        int length = String.valueOf(number).length();
        if (num > 0 && length > 8) {
            return pb.get(number);
        }
        return "Error enter";
    }

    @Override
    public void storeToFile(File phoneBookFile) {
        try ( FileWriter fw = new FileWriter(this.phoneBookFile = phoneBookFile, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            if (phoneBookFile.exists()) {
                for (Map.Entry<Integer, String> k : pb.entrySet()) {
                    bw.write(k.getKey() + ";" + k.getValue() + ";" + "\n");
                }
            } else {
                throw new FileNotFoundException();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void loadFromFile(File phoneBookFile) {
        try (FileReader fr = new FileReader(this.phoneBookFile = phoneBookFile);
             BufferedReader br = new BufferedReader(fr)) {
            if (phoneBookFile.exists()) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] arr = line.split(";");
                    if (!line.equals("")) {
                        pb.put(Integer.parseInt(arr[0]), arr[1]);
                    }
                }
                System.out.println(pb);
            } else {
                throw new FileNotFoundException();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        System.out.println("Task 2 Check");
        PhoneBook phoneBook = new MyPhone();
        File myFile = new File(new MyPhone().address);
        phoneBook.addUser("Artem", 293947710);
        phoneBook.addUser("Olga", 298745213);
        phoneBook.addUser("Marina", 298745632);
        phoneBook.addUser("Artem", 293978911);
        phoneBook.storeToFile(myFile);
        phoneBook.loadFromFile(myFile);

        PhoneBook phoneBook2 = new MyPhone();
        phoneBook2.addUser("Sergey", 293544916);
        phoneBook2.addUser("Ludmila", 291028836);
        phoneBook2.addUser("Marina", 298745632);
        phoneBook2.addUser("Oleg", 294785213);
        phoneBook2.storeToFile(myFile);
        phoneBook2.loadFromFile(myFile);
        System.out.println(phoneBook.getNameByNumber(293947710).equals("Artem"));
        System.out.println(phoneBook.getNumberByName("Marina") == 298745632);

        System.out.println("Task 3 Exception");
        System.out.println(phoneBook.getNumberByName("454"));
        System.out.println(phoneBook.getNameByNumber(223));
        phoneBook.storeToFile(new File("/asd"));

    }
}
