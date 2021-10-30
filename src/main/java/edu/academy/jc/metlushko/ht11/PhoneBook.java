package edu.academy.jc.metlushko.ht11;

import java.io.File;
import java.util.HashMap;

public interface PhoneBook {
    void addUser(String name,int number);
    Integer getNumberByName(String name);
    String getNameByNumber(int number);
    void storeToFile(File phoneBookFile);
    void loadFromFile(File phoneBookFile);
    HashMap<Integer, String> getPb();
}
