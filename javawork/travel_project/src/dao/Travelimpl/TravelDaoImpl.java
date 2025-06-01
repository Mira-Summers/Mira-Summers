package dao.Travelimpl;

import dao.TravelDao;
import pojo.Travel;
import utils.JDBCutils;

import java.sql.*;
import java.util.ArrayList;

public class TravelDaoImpl implements TravelDao{


    @Override
    public ArrayList<Travel> getTravelList() {
        Connection connection=null;//新建对象
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        ArrayList<Travel> travels = new ArrayList<>();

        try {
            connection=JDBCutils.getConnection();
            //获取数据库操作对象
            preparedStatement = connection.prepareStatement("select * from tb_travel");
            resultSet = preparedStatement.executeQuery();//把响应结果存放在resultset对象中供我们使用
            //遍历结果集
            while (resultSet!=null&&resultSet.next()){
                //获得指定列的数值
                int id=resultSet.getInt("id");
                int num=resultSet.getInt("num");
                double prize=resultSet.getDouble("prize");
                String travelName = resultSet.getString("travel_name");
                String travelDesc=resultSet.getString("travel_desc");
                String startDate = resultSet.getString("start_date");
                String endDate = resultSet.getString("end_date");
                String tripStart = resultSet.getString("trip_start");
                String tripEnd = resultSet.getString("trip_end");
                Travel travel = new Travel();//获得指定列的对象值
                travel.setId(id);
                travel.setNum(num);
                travel.setPrice(prize);
                travel.setTravelDesc(travelDesc);
                travel.setTravelName(travelName);
                travel.setStartDate(startDate);
                travel.setEndDate(endDate);
                travel.setTripStart(tripStart);
                travel.setTripEnd(tripEnd);
                travels.add(travel);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                JDBCutils.getClose(resultSet, preparedStatement,connection);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return travels;
    }

    @Override
    public Integer setTravelNum(Integer tid) {
        return null;
    }
}
