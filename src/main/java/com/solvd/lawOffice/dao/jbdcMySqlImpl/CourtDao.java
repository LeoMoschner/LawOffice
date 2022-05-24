package com.solvd.lawOffice.dao.jbdcMySqlImpl;


import com.solvd.lawOffice.binary.lawOfficeStructure.Court;
import com.solvd.lawOffice.dao.ICourtDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourtDao extends AbstractDao implements ICourtDao {

    private final static Logger LOGGER = LogManager.getLogger(CourtDao.class);
    private final static String SELECT_BY_ID = "SELECT * FROM courts WHERE id_Courts = ?";
    private final static String CREATE_NEW = "INSERT INTO courts " +
            "(`id_Courts`, `name`, `Address_id_Address`) " +
            "VALUES (?, ?, ?)";
    private final static String UPDATE = "UPDATE courts SET `name` = ?, `Address_id_Address` = ?" +
            " WHERE `id_Courts` = ?";
    private final static String DELETE_BY_ID = "DELETE from courts WHERE id_Courts = ?";

    @Override
    public Court getById(long id) {
        PreparedStatement pr = null;
        ResultSet rs = null;
        Connection con = getConnection();

        try {
            pr = con.prepareStatement(SELECT_BY_ID);
            pr.setLong(1, id);
            rs = pr.executeQuery();
            rs.next();
            Court court = new Court();
            court.setId(id);
            court.setName(rs.getString("name"));
            AddressDao addDao = new AddressDao();
            court.setAddress(addDao.getById(rs.getLong("Address_id_Address")));
            return court;

        }catch (SQLException e) {
            LOGGER.error("ERROR: Could not return the court", e);
            throw new RuntimeException(e);
        }finally {
            returnConnection(con);
            closeResources(pr);
        }
    }

    @Override
    public void save (Court court) {
        PreparedStatement pr = null;
        Connection con = getConnection();

        try {
            pr = con.prepareStatement(CREATE_NEW);
            pr.setLong(1, court.getId());
            pr.setString(2, court.getName());
            pr.setLong(3, court.getAddress().getId());
            pr.execute();
            LOGGER.info("Court saved successfully.");

        }catch (SQLException e) {
            LOGGER.error("ERROR: Could not save the court.");
            throw new RuntimeException(e);
        }finally {
            returnConnection(con);
            closeResources(pr);
        }
    }

    @Override
    public void update(Court court){
        PreparedStatement pr = null;
        Connection con = getConnection();

        try {
            pr = con.prepareStatement(UPDATE);
            pr.setLong(3, court.getId());
            pr.setString(1, court.getName());
            pr.setLong(2, court.getAddress().getId());
            pr.execute();
            LOGGER.info("Court updated successfully.");

        }catch (SQLException e){
            LOGGER.error("ERROR: Could not update the court" , e);
            throw new RuntimeException(e);
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
            LOGGER.info("Court deleted successfully.");

        }catch (SQLException e){
            LOGGER.error("ERROR: Could not delete the court.");
            throw new RuntimeException(e);
        }finally {
            returnConnection(con);
            closeResources(pr);
        }
    }
}
