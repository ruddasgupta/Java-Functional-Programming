package com.functionalprogramming.streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamVsParallelStream {
    public static void main(String[] args)
            throws Exception
    {

        List<String> arr1
                = new ArrayList<>();
        arr1.add("A");
        arr1.add("B");
        arr1.add("C");
        arr1.add("D");
        arr1.add("E");
        arr1.add("F");

        System.out.println();

        arr1.parallelStream()
                .forEach(s -> System.out.print(s));

        System.out.println();

        arr1.stream()
                .parallel()
                .forEach(s -> System.out.print(s));

        System.out.println();

        arr1.stream()
                .forEach(s -> System.out.print(s));

        System.out.println();

        arr1.parallelStream()
                .forEachOrdered(s -> System.out.print(s));
    }
}
