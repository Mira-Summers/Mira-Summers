package Anotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class MyannotationTest01 {
    public static void main(String[] args) {
        Class aclass=Class.forName("Anotation.Myclass");

        Annotation annotation=aclass.getAnnotation(Myannotation.class);

        System.out.println(annotation);


    }
}
