package com.solvd.lawOffice.dao.jbdcMySqlImpl;

import com.solvd.lawOffice.services.connectionPool.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AbstractDao {

    private static final Logger LOGGER = LogManager.getLogger(AbstractDao.class);

    public static Connection getConnection () {

        return ConnectionPool.getInstance().getConnection();
    }

    public void returnConnection (Connection connection) {

        ConnectionPool.getInstance().returnConnection(connection);
    }

    public static void closeResources (PreparedStatement pr, ResultSet rs) {
        try {
            if (pr != null) {
                pr.close();
            }
            if (rs != null) {
                rs.close();
            }
        }catch (SQLException e) {
            LOGGER.error("ERROR: Could not close resources properly", e);
            throw new RuntimeException(e);
        }

    }

    public static void closeResources (PreparedStatement pr) {
        try {
            if (pr != null) {
                pr.close();
            }
        }catch (SQLException e) {
            LOGGER.error("ERROR: Could not close resources properly", e);
            throw new RuntimeException(e);
        }
    }
}
