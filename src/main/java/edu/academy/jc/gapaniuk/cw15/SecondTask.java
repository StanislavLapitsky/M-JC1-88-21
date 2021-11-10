package edu.academy.jc.gapaniuk.cw15;

import java.util.Optional;
import java.util.stream.Stream;

public class SecondTask {
    public static void main(String[] args) {


        int n = 50;
        Integer a = Stream
                .iterate(2, x -> (x * 5) < n, x -> x + 2)

                .filter(x -> x > 10)

                .findFirst()
                .orElse(null);



        System.out.println(a);
    }

}
