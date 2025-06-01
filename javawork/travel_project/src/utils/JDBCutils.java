package utils;

import java.sql.*;
import java.util.concurrent.Callable;

public class JDBCutils {



    private static String DateBase = "sys";
    private JDBCutils(){

    }
    static{
        //注册驱动
        //捕获异常
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**获取数据库连接对象
     *
     * @return
     */
    public static Connection getConnection()throws SQLException {
        return DriverManager.getConnection("jdbc.mysql://localhost:3306/sys"+DateBase+"?characterEncoding=utf8&serverTimezone=GMT%2B8");

    }
    public static Connection getClose(ResultSet resultSet, Statement statement,Connection connection)throws SQLException {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
return null;
    }
}
