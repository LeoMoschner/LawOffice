package com.solvd.lawOffice.services.myBatisImpl;

import com.solvd.lawOffice.binary.location.Address;
import com.solvd.lawOffice.dao.IAddressDao;
import com.solvd.lawOffice.services.AddressService;
import com.solvd.lawOffice.utils.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AddressServiceImpl implements AddressService {

    private final static Logger LOGGER = LogManager.getLogger(AddressServiceImpl.class);

    @Override
    public Address getAddress (long id) {
        try (SqlSession session = SessionFactory.getInstance().getSession()){
            IAddressDao adDao = session.getMapper(IAddressDao.class);
            Address outputAd = adDao.getById(id);
            LOGGER.info("Address: " + outputAd);
            return outputAd;
        }
    }
}
