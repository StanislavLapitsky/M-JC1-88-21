package edu.academy.jc.gapaniuk.hw10i11v2;

import java.io.File;
import java.io.IOException;

public interface PhoneBook {
    void addUser(int number, String name);
    Integer getNumberByName(String name);
    String getNameByNumber(int number);
    void storeToFile(File phoneBookFile);
    void loadFromFile(File phoneBookFile) ;

}
