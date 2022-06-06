package com.solvd.lawOffice.services.mySqlImpl;

import com.solvd.lawOffice.binary.location.City;
import com.solvd.lawOffice.dao.jbdcMySqlImpl.CityDao;
import com.solvd.lawOffice.services.CityService;

public class CityServiceImpl implements CityService {

    @Override
    public City getCity (long id) {
        CityDao citDao = new CityDao();
        return citDao.getById(id);
    }

    @Override
    public void saveCity(City city) {
        CityDao citDao = new CityDao();
        citDao.save(city);
    }

    @Override
    public void updateCity(City city) {
        CityDao citDao = new CityDao();
        citDao.update(city);
    }

    @Override
    public void deleteCity(long id) {
        CityDao citDao = new CityDao();
        citDao.deleteById(id);
    }
}
