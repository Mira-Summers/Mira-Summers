package reflect;

public class ReflectTest_02 {
    public static void main(String[] args) {
        try {
            Class userClass=Class.forName("pojo.User");
            userClass.getDeclaredField()

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}
