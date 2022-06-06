package com.solvd.lawOffice.services.myBatisImpl;

import com.solvd.lawOffice.binary.location.City;
import com.solvd.lawOffice.dao.ICityDao;
import com.solvd.lawOffice.services.CityService;
import com.solvd.lawOffice.utils.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CityServiceImpl implements CityService {

    private final static Logger LOGGER = LogManager.getLogger(CityServiceImpl.class);

    @Override
    public City getCity(long id) {
        try (SqlSession session = SessionFactory.getInstance().getSession()) {
            ICityDao citDao = session.getMapper(ICityDao.class);
            City outputCit = citDao.getById(id);
            return outputCit;
        }
    }

    @Override
    public void saveCity(City city) {
        try (SqlSession session = SessionFactory.getInstance().getSession()) {
            ICityDao cityDao = session.getMapper(ICityDao.class);
            cityDao.save(city);
            session.commit();
        }
    }

    @Override
    public void updateCity(City city) {
        try (SqlSession session = SessionFactory.getInstance().getSession()) {
            ICityDao cityDao = session.getMapper(ICityDao.class);
            cityDao.update(city);
            session.commit();
        }
    }

    @Override
    public void deleteCity(long id) {
        try (SqlSession session = SessionFactory.getInstance().getSession()) {
            ICityDao cityDao = session.getMapper(ICityDao.class);
            cityDao.deleteById(id);
            session.commit();
        }
    }
}
