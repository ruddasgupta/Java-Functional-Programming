package com.functionalprogramming.intermediatemethods.filters;

import java.util.Arrays;

public class FilterExample {
    // Main driver method
    public static void main(String[] args)
    {
        // Data source
        // Custom integer inputs
        Integer[] numbers
                = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

        // Stream
        var streamOfNumbers = Arrays.stream(numbers);

        // Using filter method
        var evenNumbersStream
                = streamOfNumbers
                .filter(number -> number % 3 == 0)
                .count();

        // Print and display
        System.out.println(evenNumbersStream);
    }
}
