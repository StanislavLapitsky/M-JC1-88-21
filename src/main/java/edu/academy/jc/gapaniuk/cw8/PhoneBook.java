package edu.academy.jc.gapaniuk.cw8;

public class PhoneBook {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        System.out.println(pb.getPhoneByPhone(22));
        System.out.println(pb.getPhoneByName("Vasia3"));
        pb.print(pb.arr);
        pb.sortByName(pb.arr);
        pb.print(pb.arr);
        pb.sortByNumber(pb.arr);
        pb.print(pb.arr);


    }


    public PhoneRecord[] arr = init(5);
    public void print(PhoneRecord[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i].getValue()+"  "+arr[i].getKey());
        }

    }

    public PhoneRecord[] sortByName(PhoneRecord[] phBook) {
        String max;

        Integer tempI;
        int index;

        for (int i = 0; i < phBook.length - 1; i++) {
            max = phBook[i].getValue();
            index = i;
            for (int j = i + 1; j < phBook.length; j++) {
                if (phBook[j].getValue().compareTo(max) > 0) {
                    max = phBook[j].getValue();
                    index = j;

                }

            }

            tempI = phBook[index].getKey();

            phBook[index].setNumber(phBook[i].getKey());
            phBook[index].setKey(phBook[i].getValue());

            phBook[i].setNumber(tempI);
            phBook[i].setKey(max);

        }
        return phBook;

    } public PhoneRecord[] sortByNumber(PhoneRecord[] phBook) {
        Integer max;

        String tempS;
        int index;

        for (int i = 0; i < phBook.length - 1; i++) {
            max = phBook[i].getKey();
            index = i;
            for (int j = i + 1; j < phBook.length; j++) {
                if (phBook[j].getKey()<max) {
                    max = phBook[j].getKey();
                    index = j;

                }

            }

            tempS = phBook[index].getValue();

            phBook[index].setNumber(phBook[i].getKey());
            phBook[index].setKey(phBook[i].getValue());

            phBook[i].setNumber(max);
            phBook[i].setKey(tempS);

        }
        return phBook;

    }

    public PhoneRecord[] init(int i) {
        PhoneRecord[] rez = new PhoneRecord[i];
        for (int j = 0; j < 5; j++) {
            rez[j] = new PhoneRecord();
            rez[j].setNumber(j * 10 + j);
            rez[j].setKey("Vasia" + j);
        }

        return rez;


    }

    public Integer getPhoneByName(String name) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getValue().equals(name)) {
                return arr[i].getKey();
            }

        }
        System.out.println("error");
        return null;

    }

    public String getPhoneByPhone(Integer number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getKey() == number) {
                return arr[i].getValue();
            }

        }
        System.out.println("error");
        return null;

    }
}
