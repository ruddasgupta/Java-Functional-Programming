package com.functionalprogramming.intermediatemethods.maps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Maps {
    public static void main(String[] args)
    {
        // making the array list object
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("mango");
        fruit.add("pineapple");
        fruit.add("kiwi");
        System.out.println("List of fruit-" + fruit);

        // lets use map() to convert list of fruit
        List list = fruit.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println("List generated by map-" + list);
    }
}
