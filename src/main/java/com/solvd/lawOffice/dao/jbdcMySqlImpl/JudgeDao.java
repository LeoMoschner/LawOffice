package com.solvd.lawOffice.dao.jbdcMySqlImpl;

import com.solvd.lawOffice.binary.people.Judge;
import com.solvd.lawOffice.dao.IJudgeDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JudgeDao extends AbstractDao implements IJudgeDao {

    private final static Logger LOGGER = LogManager.getLogger(JudgeDao.class);
    private final static String SELECT_BY_ID = "SELECT * FROM judge WHERE id_Judge = ?";
    private final static String CREATE_NEW = "INSERT INTO judge " +
            "(`id_Judge`, `first_name`, `last_name`, `email`, `Address_id_Address`) " +
            "VALUES (?, ?, ?, ? ,?)";
    private final static String UPDATE = "UPDATE judge SET `first_name` = ?, `last_name` = ?, `email` = ?, `Address_id_Address` = ?" +
            " WHERE `id_Judge` = ?";
    private final static String DELETE_BY_ID = "DELETE from judge WHERE id_Judge = ?";

    @Override
    public Judge getById(long id) {
        PreparedStatement pr = null;
        ResultSet rs = null;
        Connection con = getConnection();

        try {
            pr = con.prepareStatement(SELECT_BY_ID);
            pr.setLong(1, id);
            rs = pr.executeQuery();
            rs.next();
            Judge judge = new Judge();
            judge.setId(id);
            judge.setFirstName(rs.getString("first_name"));
            judge.setLastName(rs.getString("last_name"));
            judge.setEmail(rs.getString("email"));
            AddressDao addDao = new AddressDao();
            judge.setAddress(addDao.getById(rs.getLong("Address_id_Address")));
            return judge;
        } catch (SQLException e) {
            LOGGER.error("ERROR: Could not return the judge", e);
            throw new RuntimeException(e);
        } finally {
            returnConnection(con);
            closeResources(pr);
        }
    }

    @Override
    public void save(Judge judge) {
        PreparedStatement pr = null;
        ResultSet rs = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(CREATE_NEW);
            pr.setLong(1, judge.getId());
            pr.setString(2, judge.getFirstName());
            pr.setString(3, judge.getLastName());
            pr.setString(4, judge.getEmail());
            pr.setLong(5, judge.getAddress().getId());
            pr.execute();
            LOGGER.info("Judge savec successfully.");
        } catch (SQLException e) {
            LOGGER.error("ERROR: Could not save the judge.", e);
            throw new RuntimeException(e);
        } finally {
            returnConnection(con);
            closeResources(pr);
        }
    }

    @Override
    public void update(Judge judge) {
        PreparedStatement pr = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(UPDATE);
            pr.setLong(5, judge.getId());
            pr.setString(1, judge.getFirstName());
            pr.setString(2, judge.getLastName());
            pr.setString(3, judge.getEmail());
            pr.setLong(4, judge.getAddress().getId());
            pr.execute();
            LOGGER.info("Judge updated successfully.");
        } catch (SQLException e) {
            LOGGER.error("ERROR: Could not update the judge.", e);
            throw new RuntimeException(e);
        } finally {
            returnConnection(con);
            closeResources(pr);
        }
    }

    @Override
    public void deleteById(long id) {
        PreparedStatement pr = null;
        ResultSet rs = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(DELETE_BY_ID);
            pr.setLong(1, id);
            pr.execute();
            LOGGER.info("Judge deleted successfully.");
        } catch (SQLException e) {
            LOGGER.error("ERROR: Could not delete the judge.", e);
            throw new RuntimeException(e);
        } finally {
            returnConnection(con);
            closeResources(pr);
        }
    }
}
