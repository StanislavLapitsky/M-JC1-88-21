package edu.academy.jc.gapaniuk.cw15;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstTask {
    public static void main(String[] args) {
        Set<String> count = Stream
                .generate(() -> new Random().nextInt(10))
                .limit(10)
                .filter(intValue -> {
                    return intValue % 2 == 0;
                })
                .map(intValue -> intValue.toString())
                .collect(Collectors.toSet());
        count.stream()
                .map(s->s+" ")
                .forEach(System.out::print);


        }




}
