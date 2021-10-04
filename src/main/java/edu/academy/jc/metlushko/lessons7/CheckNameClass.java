package edu.academy.jc.metlushko.lessons7;

import java.util.regex.*;

public class CheckNameClass {
    public static void main(String[] args) {

        String myPattern="[A-Z]{1}[_]?(_[A-Z])?[a-z0-9]+([A-Z]?[_]?[a-z0-9])+[A-Z]?[_]?";

        checkRegular(myPattern,"AsSsssSsS_");
        checkRegular(myPattern,"AsSSsssSsS_");
        checkRegular(myPattern,"ASsSsssSsS_");
        checkRegular(myPattern,"AssSsssSsS");
        checkRegular(myPattern,"AssSsssSsd");
        checkRegular(myPattern,"dssSsssSsd");
        System.out.println();

        checkRegular(myPattern,"AsS_sssSsS_");
        checkRegular(myPattern,"A_s_sssS_SsS_");
        checkRegular(myPattern,"A_SssSsS_");
        checkRegular(myPattern,"A_SssS_");
        checkRegular(myPattern,"A_S_SsS_");


    }
    public static void checkRegular(String pattern,String text){

        Pattern p=Pattern.compile(pattern);
        Matcher matcher=p.matcher(text);
        System.out.println(matcher.matches());

    }

}
