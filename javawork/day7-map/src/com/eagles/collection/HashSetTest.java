package com.eagles.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<String> strings = new HashSet<>();

        strings.add("hello");
        strings.add("java");
        strings.add("php");
        strings.add("hello");

        for (String string : strings) {

            System.out.println(string);

        }

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("hello");
        linkedHashSet.add("java");
        linkedHashSet.add("c++");
        linkedHashSet.add("php");

        System.out.println("---------------------------------------");

        for (String s : linkedHashSet) {

            System.out.println(s);

        }





















    }

}
