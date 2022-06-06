package com.solvd.lawOffice.dao.jbdcMySqlImpl;

import com.solvd.lawOffice.binary.lawOfficeStructure.Case;
import com.solvd.lawOffice.dao.ICaseDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CaseDao extends AbstractDao implements ICaseDao {

    private final static Logger LOGGER = LogManager.getLogger(CaseDao.class);
    private final static String SELECT_BY_ID = "SELECT * FROM cases where id_Cases = ?";
    private final static String CREATE_NEW = "INSERT INTO cases " +
            "(`id_Cases`, `name`, `defendant`, `Courts_id_Courts`, `Judge_id_Judge`) " +
            "VALUES (?, ?, ?, ? ,?)";
    private final static String UPDATE = "UPDATE cases SET `name` = ?, `defendant` = ?, `Courts_id_Courts` = ?, `Judge_id_Judges` = ?" +
            " WHERE `id_Cases` = ?";
    private final static String DELETE_BY_ID = "DELETE from cases WHERE id_Cases = ?";

    @Override
    public Case getById(long id) {
        PreparedStatement pr = null;
        ResultSet rs = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(SELECT_BY_ID);
            pr.setLong(1, id);
            rs = pr.executeQuery();
            rs.next();
            Case cas = new Case();
            cas.setId(id);
            cas.setName(rs.getString("name"));
            cas.setDefendant(rs.getString("defendant"));
            CourtDao couDao = new CourtDao();
            cas.setCourt(couDao.getById(rs.getLong("Courts_id_Courts")));
            JudgeDao judDao = new JudgeDao();
            cas.setJudge(judDao.getById(rs.getLong("Judge_id_Judge")));
            return cas;
        } catch (SQLException e) {
            LOGGER.error("ERROR: Could not return the case", e);
            throw new RuntimeException(e);
        } finally {
            returnConnection(con);
            closeResources(pr, rs);
        }
    }

    @Override
    public void save(Case cas) {
        PreparedStatement pr = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(CREATE_NEW);
            pr.setLong(1, cas.getId());
            pr.setString(2, cas.getName());
            pr.setString(3, cas.getDefendant());
            pr.setLong(4, cas.getCourt().getId());
            pr.setLong(5, cas.getJudge().getId());
            pr.execute();
            LOGGER.info("Cases savec successfully.");
        } catch (SQLException e) {
            LOGGER.error("ERROR: Could not save the case", e);
            throw new RuntimeException(e);
        } finally {
            returnConnection(con);
            closeResources(pr);
        }
    }

    @Override
    public void update(Case cas) {
        PreparedStatement pr = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(UPDATE);
            pr.setLong(5, cas.getId());
            pr.setString(1, cas.getName());
            pr.setString(2, cas.getDefendant());
            pr.setLong(3, cas.getJudge().getId());
            pr.execute();
            LOGGER.info("Case updated successfully");
        } catch (SQLException e) {
            LOGGER.error("ERROR: Could not update the case.", e);
            throw new RuntimeException(e);
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
            LOGGER.info("Case deleted successfully");
        } catch (SQLException e) {
            LOGGER.error("Could not delete the case.", e);
            throw new RuntimeException(e);
        } finally {
            returnConnection(con);
            closeResources(pr);
        }
    }
}
