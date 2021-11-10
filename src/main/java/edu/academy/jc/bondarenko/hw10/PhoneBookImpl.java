package edu.academy.jc.bondarenko.hw10;

import java.io.*;
import java.util.*;

public class PhoneBookImpl implements PhoneBook{
    public static UsersColl us;
    public static List<UsersColl> usersColl;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PhoneBook ph1 = new PhoneBookImpl();
        usersColl = new ArrayList<>();
        ph1.addUser("Vova", 777);
        ph1.addUser("Oleg", 888);
        ph1.storeToFile(new File("D:\\Java courses\\prictice\\M-JC1-88-21-all\\src\\main\\java\\edu\\academy\\jc\\bondarenko\\hw10\\phoneBook.txt"));
        PhoneBook ph2 = new PhoneBookImpl();
        ph2.loadFromFile(new File("D:\\Java courses\\prictice\\M-JC1-88-21-all\\src\\main\\java\\edu\\academy\\jc\\bondarenko\\hw10\\phoneBook.txt"));
        try {
            ph1.getNameByNumber(777);
        } catch (CatchNotFoundNumber e) {
            System.out.println("Number not found");
        }
        try {
            ph1.getNumberByName("Oleg");
        } catch (CatchNotFountEx e) {
            System.out.println("Name not found");
        }

    }
    public void addUser(String name, int number){
        us=new UsersColl(name, number);
        usersColl.add(us);
    }
    public void getNumberByName(String name) throws CatchNotFountEx {
        Collections.sort(usersColl, new ComparatorByName());
        Comparator comparator = new ComparatorByName();
        UsersColl key = new UsersColl(name);
        int i = Collections.binarySearch(usersColl, key, comparator);
        if (i < 0) {
            throw new CatchNotFountEx();
        }
        int t = i;
        while (t < usersColl.size() && usersColl.get(t).getName().equals(name)) {
            System.out.println("Name: " + usersColl.get(t).getName() + ", " + "its number: " + usersColl.get(t).getNumber());
            t++;
        }
        int q = i - 1;
        while (q >= 0 && usersColl.get(q).getName().equals(name)) {
            System.out.println("Name: " + usersColl.get(q).getName() + ", " + "its number: " + usersColl.get(q).getNumber());
            q--;
        }
    }
    public void getNameByNumber(int number) throws CatchNotFoundNumber{
        Collections.sort(usersColl, new ComparatorByNumber());
        Comparator cmp=new ComparatorByNumber();
        UsersColl key=new UsersColl(number);
        int i= Collections.binarySearch(usersColl, key, cmp);
        if(i<0){
            throw new CatchNotFoundNumber();
        }
        int t=i;
        while (t<usersColl.size() && usersColl.get(t).getNumber().equals(number)){
            System.out.println("Number: " + usersColl.get(t).getNumber() + ", "+" its name: " + usersColl.get(t).getName());
            t++;
        }
        int q=i-1;
        while(q>=0 && usersColl.get(q).getNumber().equals(number)){
            System.out.println("Number: " + usersColl.get(q).getNumber()+", "+ "its name "+ usersColl.get(q).getName());
            q--;
        }
    }
    public void storeToFile(File phoneBookFile) {
        try {
            FileWriter fw = new FileWriter(phoneBookFile, true);
            for (int i = 0; i < usersColl.size(); i++) {
                fw.write(usersColl.get(i).getName());
                fw.write(",");
                fw.write(String.valueOf(usersColl.get(i).getNumber()));
                fw.append('\n');
                fw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadFromFile(File phoneBookFile){
        String name, str;
        Integer number;
        try {
            Scanner reader= new Scanner(new FileReader(phoneBookFile));
            while (reader.hasNext()){
                str=reader.nextLine();
                String[] arr=str.split(",", 2);
                name=arr[0];
                number=Integer.parseInt(arr[1]);
                us=new UsersColl(name, number);
                usersColl.add(us);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
