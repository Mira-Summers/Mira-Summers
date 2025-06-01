package com.eagles.map;

import java.util.LinkedHashMap;

public class MapTest01 {

    public static void main(String[] args) {

        LinkedHashMap linkedHashMap = new LinkedHashMap();

        linkedHashMap.put("name","jack");
        linkedHashMap.put("age",20);
        linkedHashMap.put("address","南京市");

        for (Object o : linkedHashMap.entrySet()) {

            System.out.println(o);

        }


    }

}
