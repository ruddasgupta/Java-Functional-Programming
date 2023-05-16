package com.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class IterationExample {
    public static void main(String[] args)
    {
        List<Integer> numbers
                = Arrays.asList(11, 22, 33, 44,
                55, 66, 77, 88,
                99, 100);

        // External iterator, for Each loop
        for (Integer n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // External iterator
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        // Internal iterator
        numbers.forEach(number
                -> System.out.print(
                number + " "));
    }
}
