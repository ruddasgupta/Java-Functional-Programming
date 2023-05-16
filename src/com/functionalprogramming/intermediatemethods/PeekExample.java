package com.functionalprogramming.intermediatemethods;

import java.util.Arrays;
import java.util.List;

public class PeekExample {
    // Main driver method
    public static void main(String[] args)
    {

        // Creating a list of Integers
        List<Integer> list = Arrays.asList(0, 2, 4, 6, 8, 10);

        // Using peek without any terminal
        // operation does nothing
        list.stream().peek(System.out::println);

        // Using peek with count() method,Method
        // which is a terminal operation
        list.stream().peek(System.out::println).count();
    }
}
