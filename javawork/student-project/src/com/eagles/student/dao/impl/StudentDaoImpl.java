package com.eagles.student.dao.impl;
import com.eagles.student.dao.StudentDao;
import com.eagles.student.pojo.Student;
import com.eagles.student.utils.JDBCUtils;
import jdk.nashorn.internal.scripts.JD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> getStudentList() {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet =null;

        //创建一个集合对象
        List<Student> stuList = new ArrayList<>();

        try {
            //获取数据库连接对象
            connection = JDBCUtils.getConnection();
            //获取数据库操作对象
            preparedStatement = connection.prepareStatement("select * from tb_student ts inner join tb_class tc on ts.cid = tc.cid");
            //执行sql
            resultSet = preparedStatement.executeQuery();

            //遍历结果集
            while (resultSet != null && resultSet.next()){
                int sid = resultSet.getInt("sid");
                String stuName = resultSet.getString("stu_name");
                int sex = resultSet.getInt("sex");
                String address = resultSet.getString("address");
                String birthday = resultSet.getString("birthday");
                String hobby = resultSet.getString("hobby");
                int cid = resultSet.getInt("cid");

                //创建student对象
                Student student = new Student();
                //赋值
                student.setStudentName(stuName);
                student.setAddress(address);
                student.setCid(cid);
                student.setHobby(hobby);
                student.setSid(sid);
                student.setSex(sex);
                student.setBirthday(birthday);
                //将学生对象存储到集合中
                stuList.add(student);
            }

            return stuList;

        } catch (SQLException e) {

            throw new RuntimeException(e);

        }finally {
            JDBCUtils.getClose(resultSet,preparedStatement,connection);
        }

    }
}
