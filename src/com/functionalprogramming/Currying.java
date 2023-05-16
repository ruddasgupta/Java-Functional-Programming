package com.functionalprogramming;

import java.util.function.Function;

public class Currying {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Function<Integer, Integer>>>
                addNumbers = u -> v -> w -> u + v + w;
        int result = addNumbers.apply(2).apply(3).apply(4);
        System.out.println(result);
    }
}
