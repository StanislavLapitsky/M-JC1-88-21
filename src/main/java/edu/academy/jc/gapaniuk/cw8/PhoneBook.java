package edu.academy.jc.gapaniuk.cw8;

public class PhoneBook {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();

        // pb.print(pb.arr);
        pb.sortByName(pb.arr);
        System.out.println(pb.getPhoneByName("Lena"));
        // pb.print(pb.arr);
        pb.sortByNumber(pb.arr);
        System.out.println(pb.getPhoneByPhone(2));
      //  pb.print(pb.arr);


    }


    public PhoneRecord[] arr = init(8);

    public void print(PhoneRecord[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getValue() + "  " + arr[i].getKey());
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
                if (phBook[j].getValue().compareTo(max) < 0) {
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

    }

    public PhoneRecord[] sortByNumber(PhoneRecord[] phBook) {
        Integer max;

        String tempS;
        int index;

        for (int i = 0; i < phBook.length - 1; i++) {
            max = phBook[i].getKey();
            index = i;
            for (int j = i + 1; j < phBook.length; j++) {
                if (phBook[j].getKey() < max) {
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
        for (int j = 0; j < i; j++) {
            rez[j] = new PhoneRecord();
            rez[j].setNumber(j);
            switch (j) {
                case 0: {
                    rez[j].setKey("Vasia");
                    break;
                }
                case 1: {
                    rez[j].setKey("Inav");
                    break;
                }
                case 2: {
                    rez[j].setKey("Sergey");
                    break;
                }
                case 3: {
                    rez[j].setKey("Lena");
                    break;
                }
                case 4: {
                    rez[j].setKey("Alena");
                    break;
                }
                case 5: {
                    rez[j].setKey("Evgeniy");
                    break;
                }
                case 6: {
                    rez[j].setKey("Dima");
                    break;
                }
                case 7: {
                    rez[j].setKey("Vika");
                    break;
                }
            }

        }

        return rez;


    }

    public Integer getPhoneByName(String name) {
        int start = 0;
        int finish = arr.length;
        int current = (start + finish) / 2;
        while (!arr[current].getValue().equals(name)) {

            if (arr[current].getValue().compareTo(name) < 0) {
                start = current;

            } else {
                finish = current;

            }
            current = (start + finish) / 2;

        }

        return arr[current].getKey();

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
