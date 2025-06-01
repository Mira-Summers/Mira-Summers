package com.eagles.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {

    public static void main(String[] args) {

        //创建集合对象
        Hashtable<Object, Object> hashtable = new Hashtable<>();

        hashtable.put("name","Tom");
        hashtable.put("age",20);
        hashtable.put("address","南京市");
        hashtable.put("null","南京市");
        hashtable.put("null",null);

        for (Map.Entry<Object, Object> objectObjectEntry : hashtable.entrySet()) {

            System.out.println(objectObjectEntry);

        }




    }

}
