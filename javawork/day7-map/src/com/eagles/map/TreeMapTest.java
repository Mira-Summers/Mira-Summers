package com.eagles.map;

import com.eagles.pojo.User;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapTest {

    public static void main(String[] args) {

        //创建TreeMap集合
        TreeMap<String, Object> stringObjectTreeMap = new TreeMap<>();
        TreeMap<Integer, Object> stringObjectTreeMap02 = new TreeMap<>();


        stringObjectTreeMap.put("A",null);
        stringObjectTreeMap.put("C",null);
        stringObjectTreeMap.put("E",null);
        stringObjectTreeMap.put("B",null);
        stringObjectTreeMap.put("W",null);

        stringObjectTreeMap02.put(100,null);
        stringObjectTreeMap02.put(98,null);
        stringObjectTreeMap02.put(102,null);
        stringObjectTreeMap02.put(76,null);
        stringObjectTreeMap02.put(50,null);

//        Set<Map.Entry<String, Object>> entries = stringObjectTreeMap.entrySet();
//
//        for (Map.Entry<String, Object> entry : entries) {
//
//            System.out.println(entry.getKey());
//
//        }
//
//        System.out.println("--------------------------------------------------------");
//
//        Set<Map.Entry<Integer, Object>> entries1 = stringObjectTreeMap02.entrySet();
//
//        for (Map.Entry<Integer, Object> integerObjectEntry : entries1) {
//
//            System.out.println(integerObjectEntry);
//        }

        TreeMap<User, Object> userObjectTreeMap = new TreeMap<>();

        userObjectTreeMap.put(new User(1001,"jack1",20),null);
        userObjectTreeMap.put(new User(1002,"jack2",19),null);
        userObjectTreeMap.put(new User(1003,"jack3",23),null);
        userObjectTreeMap.put(new User(1004,"jack4",28),null);

        for (Map.Entry<User, Object> userObjectEntry : userObjectTreeMap.entrySet()) {

            System.out.println(userObjectEntry.getKey() +"==> "+userObjectEntry.getValue());

        }


















    }

}
