package edu.academy.jc.bondarenko.hw10;

import java.io.File;

public interface PhoneBook {
    void addUser(String name, int number);
    void getNumberByName(String name) throws CatchNotFountEx;
    void getNameByNumber(int number)throws CatchNotFoundNumber;
    void storeToFile(File phoneBookFile);
    void loadFromFile(File phoneBookFile);
}
