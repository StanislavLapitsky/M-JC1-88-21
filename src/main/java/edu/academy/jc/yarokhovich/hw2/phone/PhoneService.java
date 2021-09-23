package edu.academy.jc.yarokhovich.hw2.phone;

public class PhoneService {
    public static void main(String[] args) {
        Phone phone1 = new Phone(23545, "nokia", "130g");
        Phone phone2 = new Phone(15454, "motorola", "210g");
        Phone phone3 = new Phone(65987, "redmi", "190g");
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        phone1.receiveCall("Jekson");
        phone1.getNumber();
        phone2.receiveCall("Vitovt");
        phone2.getNumber();
        phone3.receiveCall("Radzivil");
        phone3.getNumber();
        phone1.receiveCall("Sapega", 37529465);
        phone1.sendMessage(4545,6565,5656,6562);
    }
}
