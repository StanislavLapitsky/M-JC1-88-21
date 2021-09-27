package edu.academy.jc.gapaniuk.hw4i5;

public class StrOp {
    public String repeatPartOfString(String s){
        StringBuilder resStr = new StringBuilder();
        int i =0;
        while ((Character.isDigit(s.charAt(i)))){
            i++;
        }
        int startInd = i;
        int finishInd = i;
        int k = 0;
        while (i < s.length() ) {
            if (Character.isDigit(s.charAt(i))) {
                finishInd = i;


                while ((Character.isDigit(s.charAt(i)))){
                    k =k*10+ Integer.parseInt(s.substring(i, i+1));
                    i++;
                    if (i==s.length()){
                        break;
                    }

                }
                for (int j = 1; j <= k; j++) {
                    resStr.append(s.substring(startInd,finishInd));
                }
                k = 0;
                startInd = i;


            } else {i++;};



        }
        if (startInd<s.length()){
            resStr.append(s.substring(startInd,s.length()));
        }

        return resStr.toString();


    }
    public String removeNumders(String s) {
        StringBuilder resStr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!(Character.isDigit(s.charAt(i)))) {
                resStr.append(s.charAt(i));
            }

        }

        return resStr.toString();
    }

    public String repeatChars(String s) {
        StringBuilder resStr = new StringBuilder();
        String s2 = s.substring(1, 2);

        int k = 0;
        int i = 0;
        if (Character.isDigit(s.charAt(0))) {
            i = 1;
        }
        ;
        while (i < s.length() - 1) {
            if (Character.isDigit(s.charAt(i + 1))) {

                k = Integer.parseInt(s.substring(i + 1, i + 2));
                for (int j = 1; j <= k; j++) {
                    resStr.append(s.charAt(i));
                }
                if (i < s.length() - 2) {
                    if (Character.isDigit(s.charAt(i + 2))) {
                        i++;
                    } else i += 2;
                } else i += 2;

                if (k == 0) {
                    continue;
                }
            } else {
                resStr.append(s.charAt(i));
                i++;
            }

        }
        if (!Character.isDigit(s.charAt(s.length() - 1))) {
            resStr.append(s.charAt(s.length() - 1));
        }
        return resStr.toString();

    }
}
