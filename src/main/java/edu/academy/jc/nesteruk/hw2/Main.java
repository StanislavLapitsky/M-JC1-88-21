package edu.academy.jc.nesteruk.hw2;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.number = "80292741398";
        phone1.weight = 123;
        phone1.model = "Pixel";

        phone2.number = "80334837546";
        phone2.weight = 254;
        phone2.model = "Xiaomi";

        phone3.number = "8044973865";
        phone3.weight = 231;
        phone3.model = "Samsung";

        System.out.println(phone1.weight + "\n" + phone1.model + "\n" + phone1.number);
        System.out.println(phone2.weight + "\n" + phone2.model + "\n" + phone2.number);
        System.out.println(phone3.weight + "\n" + phone3.model + "\n" + phone3.number);

        phone1.receiveCall("Daniil", "802927413124");
        phone2.receiveCall("Vlad");
        phone3.receiveCall("Mama", "80445338842");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.sendMessage("a", "b", "c");

    }
}
