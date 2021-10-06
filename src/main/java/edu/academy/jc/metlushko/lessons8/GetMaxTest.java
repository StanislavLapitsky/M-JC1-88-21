package edu.academy.jc.metlushko.lessons8;

public class GetMaxTest {
    public static String getMaxCheck(int a,int b){
        if(a>b&&a==GetMax.getMax(a,b)){

            return "Right!";
        }
        if(a<b&&b==GetMax.getMax(a,b)){
            return "Right!";
        }
        if(a==b){
            return "You enter equal a and b";
        }
        return "Not Right!";

    }
}
