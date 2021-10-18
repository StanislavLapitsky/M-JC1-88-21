package com.lesson9;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String,Integer> hashMap;

    public PhoneBook() {
        hashMap=new HashMap<>();
    }

    public void addPhone(String name,Integer number){
        hashMap.put(name,number);
    }
    public Integer getPhoneByName(String name){
       return hashMap.get(name);
    }

    @Override
    public String toString() {
        return "hashMap=" + hashMap ;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook=new PhoneBook();
        phoneBook.addPhone("Artem",3947719);
        phoneBook.addPhone("Kolya",7845123);
        phoneBook.addPhone("Vacia",9528465);
        phoneBook.addPhone("Vacia",9528465);

        System.out.println(phoneBook.getPhoneByName("Artem"));
        System.out.println(phoneBook.getPhoneByName("Oly"));
        System.out.println(phoneBook);









    }


}
