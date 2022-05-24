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
}
