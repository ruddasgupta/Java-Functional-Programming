package com.functionalprogramming.terminalmethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinExample {
    // Driver code
    public static void main(String[] args)
    {

        // Creating a list of integers
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

        // Using stream.min() to get minimum
        // element according to provided Integer Comparator
        Integer var = list.stream().min(Integer::compare).get();

        System.out.print(var);

        System.out.println();

        // Using Stream.min() with reverse
        // comparator to get maximum element.
        Optional<Integer> var1 = list.stream()
                .min(Comparator.reverseOrder());

        // IF var is empty, then output will be Optional.empty
        // else value in var is printed.
        if(var1.isPresent()){
            System.out.println(var1.get());
        }
        else{
            System.out.println("NULL");
        }
    }
}
