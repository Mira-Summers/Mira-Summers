package cookie;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;//加上注解
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.spi.http.HttpHandler;
import java.io.IOException;

@WebServlet("/")
public class CookieServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //获取用户名和密码的数据
        String username = request.getParameter("userename");
        String password = request.getParameter("password");

        if (username.equals("jack") && password.equals("12345")) {
            Cookie cookieUserName = new Cookie("username", username);
            Cookie cookiePassword = new Cookie("password", password);

            if (cookiePassword == null && cookieUserName == null) {
                cookieUserName = new Cookie("username", username);
                cookiePassword = new Cookie("password", password);

                cookiePassword.setMaxAge(60 * 60 * 24 * 7);
                cookieUserName.setMaxAge(60 * 60 * 24 * 7);

                response.addCookie(cookieUserName);
                response.addCookie(cookiePassword);
            }
            response.getWriter().print("成功");
        } else {
            response.getWriter().print("失败");

        }
    }
}
