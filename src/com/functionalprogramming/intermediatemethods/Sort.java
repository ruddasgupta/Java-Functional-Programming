package com.functionalprogramming.intermediatemethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 6, 7, 9);

        //Passing a function as lambda expression
        Collections.sort(numbers, (a, b) ->{ return a.compareTo(b); });

        System.out.println(numbers);
        Comparator<Integer> comparator = (a, b) ->{ return a.compareTo(b); };
        Comparator<Integer> reverseComparator = comparator.reversed();

        //Passing a function
        Collections.sort(numbers, reverseComparator);
        System.out.println(numbers);
    }
}
