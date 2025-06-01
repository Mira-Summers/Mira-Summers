package utils;

public class ReflectUtils {
    private ReflectUtils(){

    }
    public static String findClassReflect(String className){

        StringBuilder stringBuilder=null;

        try {
            Class aclass = Class.forName(className);
            stringBuilder=new StringBuilder();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        StringBuilder stringBuilder=new StringBuilder()//
        stringBuilder.append("public class");

    }
}
