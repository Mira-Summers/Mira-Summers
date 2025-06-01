package com.eagles.student.servlet;
import com.eagles.student.pojo.Student;
import com.eagles.student.service.StudentService;
import com.eagles.student.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {

    //聚合业务层的实例
    private StudentService studentService = new StudentServiceImpl();


    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //处理中文乱码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        //请求的分发处理，接收一个客户端的标识，然后 根据标识执行对应的方法
        String flag = request.getParameter("flag");

        if (flag != null && flag.equals("list")){
            getStudentList(request,response);
        }

    }

    /**
     * 实现学生的列表
     * @param request
     * @param response
     */
    public void getStudentList(HttpServletRequest request, HttpServletResponse response){

        //获取所有的学生记录
        List<Student> studentList = studentService.getStudentList();

        try {
            response.getWriter().print(studentList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //将学生集合存储在 域 中
        request.setAttribute("studentList",studentList);


    }
}
