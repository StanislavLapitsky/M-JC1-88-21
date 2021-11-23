package edu.academy.jc.nesteruk.hw11.dao;

import java.io.File;
import java.io.IOException;

public interface PhoneBook {
        void addUser(String name, int number) throws IOException;

        int getNumberByName(String name) throws IOException;

        String getNameByNumber(int number);

        void storeToFile(File phoneBookFile) throws Exception;

        void loadFromFile(File phoneBookFile) throws IOException;

}
