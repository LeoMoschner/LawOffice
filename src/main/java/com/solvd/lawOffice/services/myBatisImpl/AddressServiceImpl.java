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
            return outputAd;
        }
    }

    @Override
    public void saveAddress(Address address) {
        try (SqlSession session = SessionFactory.getInstance().getSession()) {
            IAddressDao adDao = session.getMapper(IAddressDao.class);
            adDao.save(address);
            session.commit();
        }
    }

    @Override
    public void updateAddress (Address address) {
        try (SqlSession session = SessionFactory.getInstance().getSession()) {
            IAddressDao adDao = session.getMapper(IAddressDao.class);
            adDao.update(address);
            session.commit();
        }
    }

    @Override
    public void deleteAddress (long id) {
        try (SqlSession session = SessionFactory.getInstance().getSession()) {
            IAddressDao adDao = session.getMapper(IAddressDao.class);
            adDao.deleteById(id);
            session.commit();
        }
    }
}
