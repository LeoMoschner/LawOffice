package com.solvd.lawOffice.dao.jbdcMySqlImpl;

import com.solvd.lawOffice.binary.payment.Receipt;
import com.solvd.lawOffice.dao.IReceiptDao;
import com.solvd.lawOffice.utils.exceptions.DaoException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;


public class ReceiptDao extends AbstractDao implements IReceiptDao {

    private final static Logger LOGGER = LogManager.getLogger(ReceiptDao.class);
    private final static String SELECT_BY_ID = "SELECT * from receipts WHERE id_Receipts = ?";
    private final static String DELETE_BY_ID = "DELETE from receipts WHERE id_Receipts = ?";
    private final static String CREATE_NEW = "INSERT INTO receipts (`id_Receipts`, `from`, `to`, `amount`) VALUES (?, ?, ?, ?)";
    private final static String UPDATE = "UPDATE receipts SET `from` = ?, `to` = ?, `amount` = ? WHERE `id_Receipts` = ?";

    @Override
    public Receipt getById(long id) {
        PreparedStatement pr = null;
        ResultSet rs = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(SELECT_BY_ID);
            pr.setLong(1, id);
            rs = pr.executeQuery();
            rs.next();
            Receipt receipt = new Receipt();
            receipt.setId(rs.getLong("id_Receipts"));
            receipt.setFrom(rs.getString("from"));
            receipt.setTo(rs.getString("to"));
            receipt.setAmount(rs.getInt("amount"));
            receipt.setDate(rs.getDate("date"));
            return receipt;
        } catch (SQLException e) {
            LOGGER.error("ERROR: Could not return the receipt with id: " + id, e);
            throw new DaoException(e);
        } finally {
            returnConnection(con);
            closeResources(pr, rs);
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
            LOGGER.info("Receipt successfully deleted.");
        } catch (SQLException e) {
            LOGGER.error("ERROR: Could not delete the receipt.");
            throw new DaoException(e);
        } finally {
            returnConnection(con);
            closeResources(pr);
        }
    }

    @Override
    public void save(Receipt receipt) {
        PreparedStatement pr = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(CREATE_NEW);
            pr.setLong(1, receipt.getId());
            pr.setString(2, receipt.getFrom());
            pr.setString(3, receipt.getTo());
            pr.setInt(4, receipt.getAmount());
            //pr.setDate(5, receipt.getDate());
            pr.execute();
            LOGGER.info("New receipt added correctly to Data Base.");
        } catch (SQLException e) {
            LOGGER.error("ERROR: Could not add the receipt to Data Base.", e);
            throw new DaoException(e);
        } finally {
            returnConnection(con);
            closeResources(pr);
        }
    }

    @Override
    public void update(Receipt receipt) {
        PreparedStatement pr = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(UPDATE);
            pr.setLong(4, receipt.getId());
            pr.setString(1, receipt.getFrom());
            pr.setString(2, receipt.getTo());
            pr.setInt(3, receipt.getAmount());
            pr.execute();
            con.close();
            LOGGER.info("Update completed successfully.");
        } catch (SQLException e) {
            LOGGER.error("ERROR: Could not perform the update", e);
            throw new DaoException(e);
        } finally {
            returnConnection(con);
            closeResources(pr);
        }
    }
}
