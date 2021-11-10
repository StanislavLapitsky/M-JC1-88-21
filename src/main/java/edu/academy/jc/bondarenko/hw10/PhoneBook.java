package edu.academy.jc.bondarenko.hw10;

import java.io.File;

import java.io.File;

public interface PhoneBook {
    void addUser(String name, int number);

    int getNumberByName(String name);

    String getNameByNumber(int number);

    void storeToFile(File phoneBookFile);

    void loadFromFile(File phoneBookFile);
}
