package com.eagles.oop;

import com.eagles.pojo.Animal;
import com.eagles.pojo.Cat;
import com.eagles.pojo.Dog;

public class OppTest01 {

    public static void main(String[] args) {
//
//        //创建 dog对象
//        Dog dog = new Dog();
//        dog.eat();

        //可以通过多态的方式去创建
        Animal animal = new Dog(); //向上转型
       // animal.eat();

        if (animal instanceof Dog){

            //向下转型
            Dog dog1 = (Dog)animal;
            dog1.eat();

        }

        //基于多态创建一个Cat实例
        Animal animal1 = new Cat();

        //animal1.eat();

        if (animal1 instanceof Dog){

            Dog dog2 = (Dog)animal1;
            dog2.eat();

        }







    }

}
