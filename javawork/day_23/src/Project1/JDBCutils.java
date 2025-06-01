package Project1;

import java.sql.*;

public class JDBCutils {
    final
    private static Connection connection=null;

    private JDBCutils(){}

    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/\"+DATABASE+\"?characterEncoding=utf8&serverTimezone=GMT%2B8");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    //获得数据库连接对象
    public static Connection getConnection(){return connection;}

    public static void getClose(Connection connection, ResultSet resultSet, Statement statement) {
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
