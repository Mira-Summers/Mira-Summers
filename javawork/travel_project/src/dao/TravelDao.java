package dao;

import pojo.Travel;

import java.util.ArrayList;
import java.util.List;

public interface TravelDao {
    /**
     * @return实现线路列表
     */
    List<Travel> getTravelList();

    Integer setTravelNum(Integer tid);




}
