package com.solvd.lawOffice.dao.jbdcMySqlImpl;

import com.solvd.lawOffice.binary.location.Address;
import com.solvd.lawOffice.dao.IAddressDao;
import com.solvd.lawOffice.utils.exceptions.DaoException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressDao extends AbstractDao implements IAddressDao {

    private final static Logger LOGGER = LogManager.getLogger(AddressDao.class);
    private final static String SELECT_BY_ID = "SELECT * from Address where id_Address = ?";
    private final static String CREATE_NEW = "INSERT INTO address " +
            "(`id_Address`, `postal_code`, `street_name`, `street_number`, `Cities_id_Cities`) " +
            "VALUES (?, ?, ?, ? ,?)";
    private final static String UPDATE = "UPDATE address SET `postal_code` = ?, `street_name` = ?, `street_number` = ?, `Cities_id_Cities` = ?" +
            " WHERE `id_Address` = ?";
    private final static String DELETE_BY_ID = "DELETE from address WHERE id_Address = ?";

    @Override
    public Address getById (long id) {
        PreparedStatement pr = null;
        ResultSet rs = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(SELECT_BY_ID);
            pr.setLong(1, id);
            rs = pr.executeQuery();
            rs.next();
            Address ad = new Address();
            ad.setId(rs.getLong("id_Address"));
            ad.setPostalCode(rs.getInt("postal_code"));
            ad.setStreetName(rs.getString("street_name"));
            ad.setStreetNumber(rs.getInt("street_number"));
            CityDao citDao = new CityDao();
            ad.setCity(citDao.getById(rs.getLong("Cities_id_Cities")));
            return ad;
        }catch (SQLException e) {
            LOGGER.error("ERROR: Could not return address with id: " + id, e);
            throw new DaoException(e);
        }finally {
            returnConnection(con);
            closeResources(pr, rs);
        }
    }

    @Override
    public void save (Address address) {
        PreparedStatement pr = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(CREATE_NEW);
            pr.setLong(1, address.getId());
            pr.setInt(2, address.getPostalCode());
            pr.setString(3, address.getStreetName());
            pr.setInt(4, address.getStreetNumber());
            pr.setLong(5, address.getCity().getId());
            pr.execute();
            LOGGER.info("Address saved successfully.");
        }catch (SQLException e) {
            LOGGER.error("ERROR: could not save the address", e);
            throw new DaoException(e);
        }finally {
            returnConnection(con);
            closeResources(pr);
        }
    }

    @Override
    public void update (Address address) {
        PreparedStatement pr = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(UPDATE);
            pr.setLong (5, address.getId());
            pr.setInt(1, address.getPostalCode());
            pr.setString(2, address.getStreetName());
            pr.setInt(3, address.getStreetNumber());
            pr.setLong(4, address.getCity().getId());
            pr.execute();
            LOGGER.info("Address update successfully.");
        }catch (SQLException e){
            LOGGER.error("ERROR: Could not update the address.", e);
            throw new DaoException(e);
        }finally {
            returnConnection(con);
            closeResources(pr);
        }
    }

    @Override
    public void deleteById (long id) {
        PreparedStatement pr = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(DELETE_BY_ID);
            pr.setLong(1, id);
            pr.execute();
            LOGGER.info("Address deleted successfully.");

        }catch (SQLException e) {
            LOGGER.error("ERROR: Could not delete the Address", e);
            throw new DaoException(e);
        }finally {
            returnConnection(con);
            closeResources(pr);
        }
    }
}
