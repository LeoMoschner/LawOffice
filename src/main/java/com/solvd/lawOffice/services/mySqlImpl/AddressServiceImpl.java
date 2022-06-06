package com.solvd.lawOffice.services.mySqlImpl;

import com.solvd.lawOffice.binary.location.Address;
import com.solvd.lawOffice.dao.jbdcMySqlImpl.AddressDao;
import com.solvd.lawOffice.services.AddressService;

public class AddressServiceImpl implements AddressService {

    @Override
    public Address getAddress (long id) {
        AddressDao adDao = new AddressDao();
        return adDao.getById(id);

    }
}
