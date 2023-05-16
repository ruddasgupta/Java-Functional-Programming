package com.functionalprogramming.terminalmethods;

import java.util.stream.IntStream;

public class Reduce {
    public static void main(String[] args) {

        //1 * 2 * 3 * 4 = 24
        int product = IntStream.range(1, 5)
                .reduce((num1, num2) -> num1 * num2)
                .orElse(-1);

        //1 + 2 + 3 + 4 = 10
//        int sum =  IntStream.range(1, 5).sum();
        int sum =  IntStream.range(1, 5).reduce(Integer::sum).getAsInt();

        System.out.println(product);
        System.out.println(sum);
    }
}
