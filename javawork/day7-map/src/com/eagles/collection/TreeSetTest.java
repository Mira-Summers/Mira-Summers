package com.eagles.collection;

import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet<String> stringTreeSet = new TreeSet<>();

        stringTreeSet.add("A");
        stringTreeSet.add("C");
        stringTreeSet.add("B");
        stringTreeSet.add("D");

        for (String s : stringTreeSet) {

            System.out.println(s);

        }


    }

}
