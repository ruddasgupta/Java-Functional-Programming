package com.functionalprogramming.streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamForEachVsForEach {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(6);
        list.add(3);
        list.add(4);
        // printing each element of list using forEach loop
        list.stream().forEach(System.out::print);
        System.out.println();
        // printing each element of list
        list.forEach(System.out::print);
    }
}
