package Opp_1;
import Opp_1.User;
public class Oop_Test1 {
    public static void main(String[] args){

        User user=new User();
       user.setUserName("张三");
       String userName=user.getUserName();
        System.out.println(userName);
    }
}

