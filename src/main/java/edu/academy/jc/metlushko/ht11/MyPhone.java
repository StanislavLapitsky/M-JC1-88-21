package edu.academy.jc.metlushko.ht11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MyPhone implements PhoneBook {
    private File phoneBookFile = null;
    private HashMap<Integer, String> pb =null;

    public MyPhone() {
        pb = new HashMap<>();
    }

    public HashMap<Integer, String> getPb() {
        return pb;
    }

    @Override
    public void addUser(String name, int number) {
        pb.put(number, name);
    }

    @Override
    public Integer getNumberByName(String name) {
        try {
            for (Map.Entry<Integer, String> k : pb.entrySet()) {
                if (name.equals(k.getValue())) {
                    return (k.getKey());
                }
            }
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String getNameByNumber(int number) {
        try {
            if (number > 0 && String.valueOf(number).length() > 8) {
                return pb.get(number);
            }
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return "Error enter";
    }

    @Override
    public void storeToFile(File phoneBookFile) {
        try (FileWriter fw = new FileWriter(this.phoneBookFile = phoneBookFile, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            if (phoneBookFile.exists()) {
                for (Map.Entry<Integer, String> k : pb.entrySet()) {
                    bw.write(k.getKey() + ";" + k.getValue() + ";" + "\n");
                }
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
                    stringProcessing(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private void stringProcessing(String line) {
        String[] arr = line.split(";");
        if (!line.equals("")) {
            try {
                pb.put(Integer.parseInt(arr[0]), arr[1]);
            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("Data is incorrect  ");
            }
        }
    }
}
