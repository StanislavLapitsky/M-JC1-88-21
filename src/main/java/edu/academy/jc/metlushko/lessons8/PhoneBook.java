package edu.academy.jc.metlushko.lessons8;

import java.util.Arrays;

public class PhoneBook {
    public static void main(String[] args) {
        PhoneRecord  phoneRecord=new PhoneRecord(11,"asd");
        PhoneRecord  phoneRecord1=new PhoneRecord(74,"qwe");
        PhoneRecord  phoneRecord2=new PhoneRecord(345,"rrr");
        PhoneRecord  phoneRecord3=new PhoneRecord(45,"zzzz");
        PhoneRecord[]phoneRecords=new PhoneRecord[]{phoneRecord,phoneRecord1,phoneRecord2,phoneRecord3};

        PhoneBook phoneBook=new PhoneBook();

        System.out.println(phoneBook.getPhoneByNomber(phoneRecords,11));
        System.out.println(phoneBook.getPhoneByName(phoneRecords,"rrr"));
        System.out.println(Arrays.toString(phoneBook.sortNumber(phoneRecords)));
        System.out.println(Arrays.toString(phoneBook.sortName(phoneRecords)));

    }

    public PhoneRecord getPhoneByNomber(PhoneRecord[]ph,int k){
        for (int i = 0; i < ph.length; i++) {
            if (k == ph[i].getKey()) {
                return ph[i];
            }
        }
        return null;
    }


    public PhoneRecord getPhoneByName(PhoneRecord[]ph,String str){
        for (int i = 0; i < ph.length; i++) {
            if (str.equals(ph[i].getValue())) {
                return ph[i];
            }
        }
        return null;

    }
    public PhoneRecord[] sortNumber(PhoneRecord[]ph){
        for (int i = 0; i < ph.length-1; i++) {
            if(ph[i].getKey()>ph[i+1].getKey()){
                PhoneRecord k=ph[i];
                ph[i]=ph[i+1];
                ph[i+1]=k;
            }
        }
        return ph;
    }

        public PhoneRecord[] sortName(PhoneRecord[]ph){
        for (int i = 0; i < ph.length-1; i++) {
                if (ph[i].getValue().substring(0,1).charAt(0)>ph[i+1].getValue().substring(0,1).charAt(0)){
                    PhoneRecord k=ph[i];
                    ph[i]=ph[i+1];
                    ph[i+1]=k;
                }
        }
        return ph;
    }


}
