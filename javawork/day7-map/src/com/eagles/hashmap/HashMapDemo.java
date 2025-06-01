package com.eagles.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        //1、统计字符出现的次数

        //创建hashmap集合
        HashMap<String, Integer> hashMap = new HashMap<>();

        //将字符串切割成一个一个的字符
        String[] strings = getString().split("");

        //遍历数组
        for (String str : strings) {

            //判断当前遍历到的字符是否在集合中存在，需要将空格以及长空格换行符过滤掉
            if (hashMap.containsKey(str) && !str.matches(" +|\n")){

                hashMap.put(str,hashMap.get(str) + 1);//个数在当前基础上加一

            }else if (!str.matches(" +|\n")){

                hashMap.put(str,1);//字符不存在的情况下，个数直接赋值为1
            }

        }
        System.out.println("---------------------------打印字符出现的次数------------------------------");

        for (Map.Entry<String, Integer> stringIntegerEntry : hashMap.entrySet()) {

            System.out.println(stringIntegerEntry.getKey() +"===>" +stringIntegerEntry.getValue());

        }

        //重新创建map集合
        hashMap = new HashMap<>();

        //遍历数组
        for (String str : strings) {

            //判断当前遍历到的字符是否在集合中存在，需要将空格以及长空格换行符过滤掉，将字母过滤出来
            if (hashMap.containsKey(str) && !str.matches(" +|\n") && str.matches("\\w")){

                hashMap.put(str,hashMap.get(str) + 1);

            }else if (!str.matches(" +|\n") && str.matches("\\w")){

                hashMap.put(str,1);
            }

        }

        System.out.println("---------------------------打印字母出现的次数------------------------------");

        for (Map.Entry<String, Integer> stringIntegerEntry : hashMap.entrySet()) {

            System.out.println(stringIntegerEntry.getKey() +"===>" +stringIntegerEntry.getValue());

        }


        hashMap = new HashMap<String,Integer>();
        strings = getString().split("\\W+");//通过连续的非字母去进行切割

        //对数组进行遍历
        for (String str : strings) {

            //判断当前遍历到的字符是否在集合中存在，
            if (str.toLowerCase().length() != 1 && hashMap.containsKey(str.toLowerCase())){//str.toLowerCase() 将单词所有的字母换成小写

                hashMap.put(str.toLowerCase(),hashMap.get(str.toLowerCase()) + 1);//个数在当前基础上加一

            }else if (str.toLowerCase().length() != 1){

                hashMap.put(str.toLowerCase(),1);//字符不存在的情况下，个数直接赋值为1
            }

        }

        System.out.println("---------------------------打印单词出现的次数------------------------------");

        for (Map.Entry<String, Integer> stringIntegerEntry : hashMap.entrySet()) {

            System.out.println(stringIntegerEntry.getKey() +"===>" +stringIntegerEntry.getValue());

        }

        System.out.println("---------------------------打印单词出现的次数超过三次的------------------------------");

        for (Map.Entry<String, Integer> stringIntegerEntry : hashMap.entrySet()) {

            if (stringIntegerEntry.getValue() > 3)
            System.out.println(stringIntegerEntry.getKey() +"===>" +stringIntegerEntry.getValue());

        }


    }


    public static String getString(){

      return "Tree bins (i.e., bins whose elements are all TreeNodes) are\n" +
              "     * ordered primarily by hashCode, but in the case of ties, if two\n" +
              "     * elements are of the same \"class C implements Comparable<C>\",\n" +
              "     * type then their compareTo method is used for ordering. (We\n" +
              "     * conservatively check generic types via reflection to validate\n" +
              "     * this -- see method comparableClassFor).  The added complexity\n" +
              "     * of tree bins is worthwhile in providing worst-case O(log n)\n" +
              "     * operations when keys either have distinct hashes or are\n" +
              "     * orderable, Thus, performance degrades gracefully under\n" +
              "     * accidental or malicious usages in which hashCode() methods\n" +
              "     * return values that are poorly distributed, as well as those in\n" +
              "     * which many keys share a hashCode, so long as they are also\n" +
              "     * Comparable. (If neither of these apply, we may waste about a\n" +
              "     * factor of two in time and space compared to taking no\n" +
              "     * precautions. But the only known cases stem from poor user\n" +
              "     * programming practices that are already so slow that this makes\n" +
              "     * little difference.)\n";

    }


}




