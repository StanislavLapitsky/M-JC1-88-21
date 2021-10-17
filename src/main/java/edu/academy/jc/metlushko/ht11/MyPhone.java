package edu.academy.jc.metlushko.ht11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MyPhone implements PhoneBook {
    private String name = "";
    private int number;
    private File phoneBookFile = null;
    private static final String ADDRESS = "src/com/ht11/phoneBookFile.txt";
    private HashMap<Integer, String> pb=new HashMap<>();

    @Override
    public void addUser(String name, int number) {
        pb.put(this.number = number, this.name = name);
    }

    @Override
    public int getNumberByName(String name) {
        try (FileReader fr = new FileReader(phoneBookFile);
             BufferedReader br = new BufferedReader(fr)) {
            String str;
            boolean b=false;
            while ((str = br.readLine()) != null) {
                String[] arr = str.split(";");
                for (int i = 0; i < pb.size(); i++) {
                    if (arr[1].equals(name)) {
                        return Integer.parseInt(arr[0]);
                    }
                }
            }
            if (!b){
                throw new NumberNotFoundException();
            }
        } catch (IOException | NumberNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public String getNameByNumber(int number) {
        try (FileReader fr = new FileReader(phoneBookFile);
             BufferedReader br = new BufferedReader(fr)) {
            String str;
            boolean b=false;
            while ((str = br.readLine()) != null) {
                String[] arr = str.split(";");
                for (int i = 0; i < pb.size(); i++) {
                    if (arr[0].equals(String.valueOf(number))) {
                        b=true;
                        return (arr[1]);
                    }
                }
            }
            if (!b){
                throw new NameNotFoundException();
            }
        } catch (IOException | NameNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

    @Override
    public void storeToFile(File phoneBookFile) {
        try (FileWriter fw = new FileWriter(this.phoneBookFile = phoneBookFile,true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            boolean b=false;
            for (Map.Entry<Integer, String> k : pb.entrySet()) {
                bw.write(k.getKey() + ";" + k.getValue() + ";" + "\n");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void loadFromFile(File phoneBookFile) {

        try (FileReader fr = new FileReader(this.phoneBookFile = phoneBookFile);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        System.out.println("Task 2 Check");
        PhoneBook phoneBook = new MyPhone();
        phoneBook.addUser("Artem", 293947710);
        phoneBook.addUser("Olga", 298745213);
        phoneBook.addUser("Marina", 298745632);
        phoneBook.addUser("Artem", 293978911);
        File myFile=new File(ADDRESS);
        phoneBook.storeToFile(myFile);
        PhoneBook phoneBook2 = new MyPhone();
        phoneBook2.addUser("Sergey", 293544916);
        phoneBook2.addUser("Ludmila", 291028836);
        phoneBook2.addUser("Marina", 298745632);
        phoneBook2.addUser("Oleg", 294785213);
        phoneBook2.storeToFile(myFile);
        phoneBook2.loadFromFile(myFile);
        System.out.println(phoneBook.getNameByNumber(293947710).equals("Artem"));
        System.out.println(phoneBook.getNumberByName("Marina")==298745632);

        System.out.println("Task 3 Exception");
        phoneBook.getNumberByName("454");
        phoneBook.getNameByNumber(223);
        phoneBook.storeToFile(new File("/asd"));

    }
}
