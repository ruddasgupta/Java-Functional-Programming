package com.functionalprogramming.terminalmethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxExample {
    // Driver code
    public static void main(String[] args)
    {

        // Creating a list of integers
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

        // Using stream.max() to get maximum
        // element according to provided Comparator
        // and storing in variable var
        Integer var = list.stream().max(Integer::compare).get();

        System.out.print("The maximum value is : " + var);

        System.out.println();

        // Using stream.max() to get maximum
        // element according to provided Comparator
        // Here, the smallest element in list
        // will be stored in variable var
        Optional<Integer> var1 = list.stream()
                .max(Comparator.reverseOrder());

        // If a value is present, isPresent()
        // will return true, else display message
        if (var1.isPresent()) {
            System.out.println("The maximum value is : " + var1.get());
        }
        else {
            System.out.println("-1");
        }
    }
}
