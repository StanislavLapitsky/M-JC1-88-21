package edu.academy.jc.yarokhovich.hw10_11;

import java.io.File;

public interface PhoneBook {
    void addUser(String name, int number);
    int getNumberByName(String name);
    String getNameByNumber(int number);
    void storeToFile(File phoneBookFile);
    void loadFromFile(File phoneBookFile);

}
