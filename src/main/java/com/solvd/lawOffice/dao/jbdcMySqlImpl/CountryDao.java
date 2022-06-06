package com.solvd.lawOffice.dao.jbdcMySqlImpl;

import com.solvd.lawOffice.binary.location.Country;
import com.solvd.lawOffice.dao.ICountryDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryDao extends AbstractDao implements ICountryDao {

    private final static Logger LOGGER = LogManager.getLogger(CountryDao.class);
    private final static String SELECT_BY_ID = "SELECT * FROM country WHERE id_Country = ?";
    private static final String CREATE_NEW = "INSERT INTO country (`id_Country`, `name`) VALUES (?, ?)";
    private final static String UPDATE = "UPDATE country SET `name` = ? WHERE `id_Country` = ?";
    private final static String DELETE_BY_ID = "DELETE from country WHERE id_Country = ?";

    @Override
    public Country getById(long id) {
        PreparedStatement pr = null;
        ResultSet rs = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(SELECT_BY_ID);
            pr.setLong(1, id);
            rs = pr.executeQuery();
            rs.next();
            Country coun = new Country();
            coun.setId(rs.getLong("id_Country"));
            coun.setName(rs.getString("name"));
            return coun;
        } catch (SQLException e) {
            LOGGER.info("ERROR: Could not return country with id: " + id, e);
            throw new RuntimeException();
        } finally {
            returnConnection(con);
            closeResources(pr, rs);
        }
    }

    @Override
    public void save(Country country) {
        PreparedStatement pr = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(CREATE_NEW);
            pr.setLong(1, country.getId());
            pr.setString(2, country.getName());
            pr.execute();
            LOGGER.info("Country saved successfully");
        } catch (SQLException e) {
            LOGGER.error("ERROR: Could not save the country", e);
            throw new RuntimeException();
        } finally {
            returnConnection(con);
            closeResources(pr);
        }
    }

    @Override
    public void update(Country country) {
        PreparedStatement pr = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(UPDATE);
            pr.setLong(2, country.getId());
            pr.setString(1, country.getName());
            pr.execute();
            LOGGER.info("Country updated successfully.");
        } catch (SQLException e) {
            LOGGER.error("ERROR: Could not update the country.", e);
            throw new RuntimeException();
        } finally {
            returnConnection(con);
            closeResources(pr);
        }
    }

    @Override
    public void deleteById(long id) {
        PreparedStatement pr = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(DELETE_BY_ID);
            pr.setLong(1, id);
            pr.execute();
            LOGGER.info("Country deleted successfully");
        } catch (SQLException e) {
            LOGGER.error("ERROR: Could not delete the Country", e);
            throw new RuntimeException(e);
        } finally {
            returnConnection(con);
            closeResources(pr);
        }
    }
}
