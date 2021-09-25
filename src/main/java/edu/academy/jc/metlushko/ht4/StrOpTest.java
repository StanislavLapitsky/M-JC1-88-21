package edu.academy.jc.metlushko.ht4;


public class StrOpTest {
    public static void checkRemoveNumbers(String s){
        String str=s.replaceAll("[0-9]","");
        if(str.equals(StrOp.removeNumbers(s))){
            System.out.println(StrOp.removeNumbers(s));
            System.out.println("All right in method removeNumbers");
        }
        else {
            System.out.println("Not right working! ");
        }
    }
    public static void checkrepeatChars(String s,String result){
        if((StrOp.repeatChars(s)).equals(result)){
            System.out.println("All right in method repeatChars ");
        }
        else {
            System.out.println("Not right working! ");
        }
    }
    public static void checkrepeatCharsHard(String s,String result){
        if((StrOp.repeatCharsHard(s)).equals(result)){
            System.out.println("All right in method repeatCharsHard ");
        }
        else {
            System.out.println("Not right working! ");
        }

    }
}
