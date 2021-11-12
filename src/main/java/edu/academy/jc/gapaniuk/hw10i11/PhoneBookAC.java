package edu.academy.jc.gapaniuk.hw10i11;

import java.io.File;

import java.util.HashMap;

public abstract class PhoneBookAC extends HashMap<Integer,String> {
    public abstract void addUser(int number, String name);
    public abstract Integer getNumberByName(String name);
    public abstract String getNameByNumber(int number);
    public abstract void storeToFile(File phoneBookFile) ;
    public abstract void loadFromFile(File phoneBookFile) ;

}
