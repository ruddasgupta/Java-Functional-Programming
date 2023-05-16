package com.functionalprogramming.functionalinterface;

@FunctionalInterface
interface A {
    void show();
}

//class B implements A {
//    public void show() {
//        System.out.println("Hi");
//    }
//}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
//        A obj = new B();
//        obj.show();
//        A obj = new A() {
//            @Override
//            public void show() {
//                System.out.println("Hi inside anonymous class");
//            }
//        };
//        obj.show();
        A obj = () -> {
            System.out.println("Hi inside lambda");
        };
        obj.show();
    }
}
