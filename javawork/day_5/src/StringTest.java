public class StringTest {
    public static void main(String[] args){
        String str = "hello java";
        String str2 = "hello";
        String substring = str.substring(1);
        System.out.println(substring);
        String substring1 = str.substring(6, 10);
        String substring2 = str.substring(0, 5);
        System.out.println(substring1);
        System.out.println(substring2);
        System.out.println(str.length());
        boolean b = str.endsWith("java");//判断字符串是否以某个字符串结尾
        System.out.println(b);
        byte[] bytes = str.getBytes();//将字符串转为Byte数组

    }
}
