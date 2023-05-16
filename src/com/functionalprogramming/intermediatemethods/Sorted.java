package com.functionalprogramming.intermediatemethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Sorted {
    // Driver code
    public static void main(String[] args)
    {

        // Creating a list of Integers
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

        // Using forEach(Consumer action) to
        // print the elements of stream
        // in reverse order
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);

        System.out.println();

        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Lorem", "ipsum",
                "dolor", "sit");

        // Using forEach(Consumer action) to print
        // Character at index 1 in reverse order
        stream.sorted(Comparator.reverseOrder())
                .flatMap(str -> Stream.of(str.charAt(1)))
                .forEach(System.out::print);
    }
}
