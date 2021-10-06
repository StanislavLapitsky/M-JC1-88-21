package edu.academy.jc.metlushko.lessons8;

public class PhoneRecord implements Pair<Integer,String>{
    int i;
    String str;
    public PhoneRecord(int i, String str) {
        this.i=i;
        this.str=str;
    }

    @Override
    public Integer getKey() {
        return i;
    }



    @Override
    public String getValue() {
        return str;
    }

    @Override
    public String toString() {
        return "PhoneRecord{" +
                "i=" + i +
                ", str='" + str + '\'' +
                '}';
    }
}
