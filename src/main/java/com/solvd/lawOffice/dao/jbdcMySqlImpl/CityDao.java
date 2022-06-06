package com.solvd.lawOffice.dao.jbdcMySqlImpl;

import com.solvd.lawOffice.binary.location.City;
import com.solvd.lawOffice.dao.ICityDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CityDao extends AbstractDao implements ICityDao {

    private final static Logger LOGGER = LogManager.getLogger(CityDao.class);
    private final static String SELECT_BY_ID = "SELECT * FROM cities WHERE id_Cities = ?";
    private final static String CREATE_NEW = "INSERT INTO cities (`id_Cities`, `name`, `Country_id_Country) VALUES (?, ?, ?)";
    private final static String UPDATE = "UPDATE cities SET `name` = ?, `Country_id_Country` = ? WHERE `id_Cities` = ?";
    private final static String DELETE_BY_ID = "DELETE from cities WHERE id_Cities = ?";

    @Override
    public City getById(long id) {
        PreparedStatement pr = null;
        ResultSet rs = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(SELECT_BY_ID);
            pr.setLong(1, id);
            rs = pr.executeQuery();
            rs.next();
            City cit = new City();
            cit.setId(rs.getLong("id_Cities"));
            cit.setName(rs.getString("name"));
            CountryDao counDao = new CountryDao();
            cit.setCountry(counDao.getById(rs.getLong("Country_id_Country")));
            return cit;
        }catch (SQLException e) {
            LOGGER.error ("ERROR: Could not return city with id: " + id, e);
            throw new RuntimeException();
        }finally {
            returnConnection(con);
            closeResources(pr, rs);
        }
    }

    @Override
    public void save (City city) {
        PreparedStatement pr = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(CREATE_NEW);
            pr.setLong(1, city.getId());
            pr.setString(2, city.getName());
            pr.setLong(3, city.getCountry().getId());
            pr.execute();
            LOGGER.info("City saved successfully.");
        }catch (SQLException e) {
            LOGGER.error("ERROR: Could not save the city", e);
            throw new RuntimeException(e);
        }finally {
            returnConnection(con);
            closeResources(pr);
        }
    }

    @Override
    public void update (City city){
        PreparedStatement pr = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(UPDATE);
            pr.setLong(3, city.getId());
            pr.setString (1, city.getName() );
            pr.setLong(2, city.getCountry().getId());
            pr.execute();
            LOGGER.info ("City updated successfully");
        }catch (SQLException e) {
            LOGGER.error("ERROR: Could not update the city.");
            throw new RuntimeException(e);
        }finally {
            returnConnection(con);
            closeResources(pr);
        }
    }

    @Override
    public void deleteById (long id){
        PreparedStatement pr = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(DELETE_BY_ID);
            pr.setLong(1, id);
            pr.execute();
            LOGGER.info("City deleted successfully.");
        }catch (SQLException e) {
            LOGGER.error("ERROR: Could not delete the city.", e);
            throw new RuntimeException(e);
        }finally {
            returnConnection(con);
            closeResources(pr);
        }
    }
}
