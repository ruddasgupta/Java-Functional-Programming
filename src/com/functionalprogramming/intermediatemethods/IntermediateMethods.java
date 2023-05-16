package com.functionalprogramming.intermediatemethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateMethods {
    public static void main(String[] args) {
        List<String> stringList =
                Arrays.asList("One", "Two", "Three", "Four", "Five", "One");

        System.out.println("Example - Filter\n");
        //Filter strings whose length are greater than 3.
        Stream<String> longStrings = stringList
                .stream()
                .filter( s -> {return s.length() > 3; });

        //print strings
        longStrings.forEach(System.out::println);

        System.out.println("\nExample - Map\n");
        //map strings to UPPER case and print
        stringList
                .stream()
                .map( s -> s.toUpperCase())
                .forEach(System.out::println);

        List<String> sentenceList
                = Arrays.asList("I am Mahesh.", "I love Java 8 Streams.");

        // "I am Mahesh.", "I love Java 8 Streams."
        // flat map
        // I, am, Mahesh., I, love, Java, 8, Streams.

        System.out.println("\nExample - flatMap\n");
        //map strings to UPPER case and print
        sentenceList
                .stream()
                .flatMap( s -> { return  (Stream<String>)
                        Arrays.asList(s.split(" ")).stream(); })
                .forEach(System.out::println);

        System.out.println("\nExample - distinct\n");
        //map strings to UPPER case and print
        stringList
                .stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("\nExample - limit\n");
        //map strings to UPPER case and print
        stringList
                .stream()
                .limit(2)
                .forEach(System.out::println);
    }
}
