package servlet;

import pojo.Travel;
import service.TravelService;
import service.travelServiceImpl.TravelServiceImpl;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class TravelServlet extends HttpServlet {

    private TravelService travelService = new TravelServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String flag = request.getParameter("flag");
        if (flag != null && flag.equals("list")) {
            getTravelList(request, response);
        } else if (flag != null && flag.equals("toTravelAdd")) {
            toTravelAdd(request, response);
        } else if (flag!=null) {
            
        }
    }



    public void toTravelAdd(HttpServletRequest request, HttpServletResponse response) {
        String tid = request.getParameter("tid");
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("tid", tid);//把tid的值传到域中
        try {
            response.sendRedirect("http://localhost:8088/travel_project_war_exploded/web/jsp/travel-add.jsp");
            //绝对路径
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void getTravelList(HttpServletRequest request, HttpServletResponse response) {
        List<Travel> travelList = travelService.getTravelList();
        request.setAttribute("travelList", travelList);
        try {
            request.getRequestDispatcher("/jsp/travel-list.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            response.getWriter().print(travelList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }}

