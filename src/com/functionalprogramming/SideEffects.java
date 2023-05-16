package com.functionalprogramming;

public class SideEffects {

    private static double valueUsed = 0.0;

    public static void main(String[] args) {
        int result1 = sum(2,3);
        System.out.println(result1);
//        result1 = sum(2,3);
//        System.out.println(result1);

        double result2 = randomSum(2.0,3.0);
        System.out.println(result2);
//        result2 = randomSum(2.0,3.0);
//        System.out.println(result2);
    }
    static int sum(int a, int b){
        return a + b;
    }

    static double randomSum(double a, double b){
        valueUsed = Math.random();
        return valueUsed + a + b;
    }
}
