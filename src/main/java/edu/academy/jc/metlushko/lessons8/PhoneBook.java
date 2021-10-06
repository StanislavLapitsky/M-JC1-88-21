package edu.academy.jc.metlushko.lessons8;

public class PhoneBook {
    public static void main(String[] args) {
        PhoneRecord  phoneRecord=new PhoneRecord(11,"asd");
        PhoneRecord  phoneRecord1=new PhoneRecord(74,"qwe");
        PhoneRecord  phoneRecord2=new PhoneRecord(345,"rrr");
        PhoneRecord  phoneRecord3=new PhoneRecord(45,"zzzz");
        PhoneRecord[]phoneRecords=new PhoneRecord[]{phoneRecord,phoneRecord1,phoneRecord2,phoneRecord3};

        PhoneBook phoneBook=new PhoneBook();

        phoneBook.getPhoneByNomber(phoneRecords,11);
        phoneBook.getPhoneByName(phoneRecords,"rrr");
        phoneBook.sortNumber(phoneRecords);
        phoneBook.sortName(phoneRecords);

    }
    public void getPhoneByNomber(PhoneRecord[]ph,int k){
        for (PhoneRecord p : ph) {
            if (k == p.getKey()) {
                System.out.println(p.getKey() + " " + p.getValue() + "  " + p.getClass().getName()+"\n");
            }
        }

    }
    public void getPhoneByName(PhoneRecord[]ph,String str){
        for (PhoneRecord p : ph) {
            if (str.equals(p.getValue())) {
                System.out.println(p.getKey() + " " + p.getValue() + "  " + p.getClass().getName()+"\n");
            }
        }

    }
    public void sortNumber(PhoneRecord[]ph){
        for (int i = 0; i < ph.length-1; i++) {
            if(ph[i].getKey()>ph[i+1].getKey()){
                PhoneRecord k=ph[i];
                ph[i]=ph[i+1];
                ph[i+1]=k;
            }
        }
        for (PhoneRecord p : ph) {
            System.out.println(p.getKey() + " " + p.getValue());
        }
        System.out.println();
    }
    public void sortName(PhoneRecord[]ph){
        for (int i = 0; i < ph.length-1; i++) {
            if (ph[i].getValue().substring(0,1).charAt(0)>ph[i+1].getValue().substring(0,1).charAt(0)){
                PhoneRecord k=ph[i];
                ph[i]=ph[i+1];
                ph[i+1]=k;
            }
        }
        for (PhoneRecord p : ph) {
            System.out.println(p.getKey() + " " + p.getValue());

        }
    }

}
