package pojo;


public class User {
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public String password;

    private String userName;




}
