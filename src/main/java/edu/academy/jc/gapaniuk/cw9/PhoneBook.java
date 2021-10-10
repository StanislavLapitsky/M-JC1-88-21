package edu.academy.jc.gapaniuk.cw9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        PhoneBook PB=new PhoneBook();
        PB.addPhone("Sergey",123);
        PB.addPhone("Vika",108);
        PB.addPhone("Dima",223);
        PB.addPhone("Lena",425);
        if (!(PB.getPhoneByName("Lena")==425)){
            System.out.println("error");
        }
        if (!(PB.getPhoneByName("Vika")==108)){
            System.out.println("error");
        }
        PB.addPhone("Vika",111);
        PB.addPhone("Vika",100);
        System.out.println(PB.getPhoneByName("Vika1"));


    }
    public Map<String,Integer> subscriber =new HashMap<>();
    public void addPhone(String name, Integer number){
        subscriber.put(name,number);
    }
    public Integer getPhoneByName(String name){
        Iterator<Map.Entry<String,Integer>> iter =subscriber.entrySet().iterator();
        Iterator<Map.Entry<String,Integer>> iter1 =subscriber.entrySet().iterator();

        while (iter.hasNext()){
            if (iter.next().getKey().equals(name)){
                return iter1.next().getValue();
            }
            iter1.next();

        }
        return null;
    }

}
