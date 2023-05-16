package com.functionalprogramming.intermediatemethods.filters;

import java.util.ArrayList;

public class FilterExample4 {
    public static void main(String[] args)
    {
        // Creating an ArrayList of Integer type
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements to above object of Arraylist
        // Custom inputs
        list.add(20);
        list.add(4);
        list.add(76);
        list.add(21);
        list.add(3);
        list.add(80);

        var stream = list.stream();

        var numbers
                = stream.filter(number -> number % 2 == 0)
                .filter(number -> number > 20);

        // Print all the elements of the stream on the console
        numbers.forEach(System.out::println);
    }
}
