package com.functionalprogramming.terminalmethods;

import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main(String[] args) {
        // creating a list of Integers
        List<Integer> list = Arrays.asList(0, 2, 2, 4, 6,
                8, 10, 10, 12);

        // Using count() to count the number
        // of elements in the stream and
        // storing the result in a variable.
        long total = list.stream().count();

        // Displaying the number of elements
        System.out.println(total);

        // Using count() to count the number
        // of distinct elements in the stream and
        // storing the result in a variable.
        total = list.stream().distinct().count();

        // Displaying the number of elements
        System.out.println(total);
    }
}
