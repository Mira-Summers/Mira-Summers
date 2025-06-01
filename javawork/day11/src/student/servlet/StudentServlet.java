package student.servlet;

import student.pojo.Student;
import student.service.StudentService;
import student.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 *
 */
//写资源路径
@WebServlet("/test01")
public class StudentServlet extends HttpServlet {
    private StudentService studentService=new StudentServiceImpl() {};
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
        //处理中文乱码
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        //接收客户端标识
        String flag=request.getParameter("flag");

        if(flag!=null&flag.equals("list")){

        }
    }
}