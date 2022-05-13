package com.solvd.lawOffice.dao.jbdcMySqlImpl;

import com.solvd.lawOffice.binary.Receipt;
import com.solvd.lawOffice.dao.IReceiptDao;
import com.solvd.lawOffice.services.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.io.IOException;
import java.sql.*;


public class ReceiptDao implements IReceiptDao {

    private final static Logger LOGGER = (Logger) LogManager.getLogger(ReceiptDao.class);

    @Override
    public Receipt getById (long id) throws IOException, SQLException {

            try (Connection con = ConnectionPool.ConnectToDb()) {
                PreparedStatement pr = con.prepareStatement("SELECT * from receipts WHERE id_Receipts = ?");
                pr.setLong(1, id);
                ResultSet rs = pr.executeQuery();
                rs.next();
                System.out.println(rs.getLong("id_Receipts"));
                Receipt receipt = new Receipt();
                receipt.setId(rs.getLong("id_Receipts"));
                receipt.setFrom(rs.getString("from"));
                receipt.setTo(rs.getString("to"));
                receipt.setAmount(rs.getInt("amount"));
                receipt.setDate(rs.getDate("date"));
                pr.close();
                rs.close();
                con.close();
                return receipt;
            }
    }

    @Override
    public void deleteById (long id) throws SQLException, IOException {

        try (Connection con = ConnectionPool.ConnectToDb()) {
            PreparedStatement pr = con.prepareStatement("DELETE from receipts WHERE id_Receipts = ?");
            pr.setLong(1, id);
            pr.execute();
            pr.close();
            con.close();
            LOGGER.info("Receipt successfully deleted");
        }
    }

    @Override
    public void save (Receipt receipt) throws SQLException, IOException {

        try (Connection con = ConnectionPool.ConnectToDb()) {
            PreparedStatement pr = con.prepareStatement("INSERT INTO receipts (`id_Receipts`, `from`, `to`, `amount`) " +
                    "VALUES (?, ?, ?, ?)");

            pr.setLong(1, receipt.getId());
            pr.setString(2, receipt.getFrom());
            pr.setString(3, receipt.getTo());
            pr.setInt(4, receipt.getAmount());
            //pr.setDate(5, receipt.getDate());
            pr.execute();
            pr.close();
        }
    }

    @Override
    public void update (Receipt receipt) throws SQLException, IOException {

        try (Connection con = ConnectionPool.ConnectToDb()) {
            PreparedStatement pr = con.prepareStatement("UPDATE receipts SET `from` = ?, `to` = ?, `amount` = ? " +
                    "WHERE `id_Receipts` = ?");

            pr.setLong(4, receipt.getId());
            pr.setString(1, receipt.getFrom());
            pr.setString(2, receipt.getTo());
            pr.setInt(3, receipt.getAmount());
            pr.execute();
            pr.close();
            LOGGER.info("Update completed successfully.");
        }
    }
}
