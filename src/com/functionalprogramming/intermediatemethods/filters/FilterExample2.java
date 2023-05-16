package com.functionalprogramming.intermediatemethods.filters;

import java.util.Arrays;
import java.util.stream.Stream;

public class FilterExample2 {
    public static void main(String[] args)
    {
        // Data Source
        Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

        // Stream
        Stream<Integer> streamOfNumbers
                = Arrays.stream(numbers);

        // filter all the even numbers
        Stream<Integer> evenNumbersStream
                = streamOfNumbers.filter(
                number -> number % 2 == 0);
    }
}
