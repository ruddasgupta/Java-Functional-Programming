package com.functionalprogramming.terminalmethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalMethods {
    public static void main(String[] args) {
        List<String> stringList
                = Arrays.asList("One", "Two", "Three", "Four", "Five", "One");

        System.out.println("Example - anyMatch\n");
        //anyMatch - check if Two is present?
        System.out.println("Two is present: "
                + stringList
                .stream()
                .anyMatch(s -> {return s.contains("Two");}));

        System.out.println("\nExample - allMatch\n");
        //allMatch - check if length of each string is greater than 2.
        System.out.println("Length > 2: "
                + stringList
                .stream()
                .allMatch(s -> {return s.length() > 2;}));

        System.out.println("\nExample - noneMatch\n");
        //noneMatch - check if length of each string is greater than 6.
        System.out.println("Length > 6: "
                + stringList
                .stream()
                .noneMatch(s -> {return s.length() > 6;}));

        System.out.println("\nExample - collect\n");
        System.out.println("List: "
                + stringList
                .stream()
                .filter(s -> {return s.length() > 3;})
                .collect(Collectors.toList()));

        System.out.println("\nExample - count\n");
        System.out.println("Count: "
                + stringList
                .stream()
                .filter(s -> {return s.length() > 3;})
                .count());

        System.out.println("\nExample - findAny\n");
        System.out.println("findAny: "
                + stringList
                .stream()
                .findAny().get());

        System.out.println("\nExample - findFirst\n");
        System.out.println("findFirst: "
                + stringList
                .stream()
                .findFirst().get());

        System.out.println("\nExample - forEach\n");
        stringList
                .stream()
                .forEach(System.out::println);

        System.out.println("\nExample - min\n");
        System.out.println("min: "
                + stringList
                .stream()
                .min((s1, s2) -> { return s1.compareTo(s2);}));

        System.out.println("\nExample - max\n");
        System.out.println("min: "
                + stringList
                .stream()
                .max((s1, s2) -> { return s1.compareTo(s2);}));

        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = List.of(1,2,3,4);

        System.out.println("reduced: "
                + list1
                .stream()
                .reduce((s1, s2) -> { return s1 + s2;})
                .get());

        System.out.println("\nExample - reduce\n");
        System.out.println("reduced: "
                + stringList
                .stream()
                .reduce((s1, s2) -> { return s1 + ", "+ s2;})
                .get());
    }
}
