package com.functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalProgrammingExample {

    void imperative(List<String> stringList) {
        // imperative declaration
        List<String> filteredList = new ArrayList<>();

        for (String string: stringList) {
            if (string.equals("Hello") || string.equals("Are")) {
                filteredList.add(string);
            }
        }

        List<String> mappedList = new ArrayList<>();
        for (String string: filteredList) {
            mappedList.add(string + " String");
        }

        for (String string: mappedList) {
            System.out.println(string);
        }
    }

    void declarative(List<String> stringList) {
        //functional style
        stringList.stream() // "Hello", "World", "How", "Are", "You", "Today"
                .filter(s -> s.equals("Hello") || s.equals("Are"))
                .map(s -> s + " String")
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hello", "World", "How", "Are", "You", "Today");

        FunctionalProgrammingExample example = new FunctionalProgrammingExample();
        example.imperative(stringList);
        example.declarative(stringList);
    }
}
