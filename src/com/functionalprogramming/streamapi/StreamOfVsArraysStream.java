package com.functionalprogramming.streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfVsArraysStream {
    public static void main(String[] args)
    {
        // Creating an integer array
        int arr[] = { 1, 2, 3, 4, 5 };

        // --------- Using Arrays.stream() ---------

        // to convert int array into Stream
        IntStream intStream = Arrays.stream(arr);

        // Displaying elements in Stream
        intStream.forEach(str -> System.out.print(str + " "));

        // --------- Using Stream.of() ---------

        // to convert int array into Stream
        Stream<int[]> stream = Stream.of(arr);

        // Displaying elements in Stream
        stream.forEach(str -> System.out.print(str + " "));
    }
}
