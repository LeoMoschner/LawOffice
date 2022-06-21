package com.solvd.lawOffice.dao.jbdcMySqlImpl;

import com.solvd.lawOffice.binary.payment.Payment;
import com.solvd.lawOffice.dao.IPaymentDao;
import com.solvd.lawOffice.utils.exceptions.DaoException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaymentDao extends AbstractDao implements IPaymentDao {

    private final static Logger LOGGER = LogManager.getLogger(PaymentDao.class);
    private final static String SELECT_BY_CLIENT_ID = "SELECT * from payments WHERE Clients_id_Clients = ?";

    @Override
    public List<Payment> getById(long clientId) {
        PreparedStatement pr = null;
        ResultSet rs = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(SELECT_BY_CLIENT_ID);
            pr.setLong(1, clientId);
            rs = pr.executeQuery();
            List<Payment> payList = new ArrayList<>();
            while (rs.next()) {
                Payment pay = new Payment();
                pay.setId(rs.getLong("id_Payments"));
                pay.setAmount(rs.getInt("amount"));
                //date
                ReceiptDao recDao = new ReceiptDao();
                pay.setReceipt(recDao.getById(rs.getLong("Receipts_id_Receipts")));
                ClientDao cliDao = new ClientDao();
                pay.setClient(cliDao.getById(rs.getLong("Clients_id_Clients")));
                payList.add(pay);
            }
            return payList;
        } catch (SQLException e) {
            LOGGER.error("ERROR: Could not return the payments list", e);
            throw new DaoException(e);
        } finally {
            returnConnection(con);
            closeResources(pr, rs);
        }
    }
}
