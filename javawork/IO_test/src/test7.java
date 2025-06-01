import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class test7 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("object.txt"));
            User user1=new User(1001,"max","镇江");
            User user2=new User(1001,"jack","镇江");
            User user3=new User(1001,"john","镇江");

            ArrayList<User> users=new ArrayList<>;
            users.add(user1);
            users.add(user2);
            users.add(user3);

            ObjectOutputStream.writeObject(users);

            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
