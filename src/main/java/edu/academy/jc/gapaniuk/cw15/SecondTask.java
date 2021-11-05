package edu.academy.jc.gapaniuk.cw15;

import java.util.Optional;
import java.util.stream.Stream;

public class SecondTask {
    public static void main(String[] args) {


        int n = 50;
        Integer a = Stream
                .iterate(2, x -> (x * 5) < n, x -> x + 2)
                //.peek(System.out::println)
                .filter(x -> x > 10)
               // .peek(System.out::println)
                .findFirst()
                .orElse(null);

        //Optional<Integer> aa = Optional.of();

        System.out.println(a);
    }

}
