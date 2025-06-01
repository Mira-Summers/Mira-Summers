package service.travelServiceImpl;


import dao.TravelDao;
import dao.Travelimpl.TravelDaoImpl;
import pojo.Travel;
import service.TravelService;

import java.util.List;

public class TravelServiceImpl implements TravelService {
    private TravelDao travelDao=new TravelDaoImpl();

    @Override
    public List<Travel> getTravelList() {
        return travelDao.getTravelList();
    }
}
