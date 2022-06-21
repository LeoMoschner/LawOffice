package com.solvd.lawOffice.utils;

import com.solvd.lawOffice.utils.exceptions.ConnectionPoolException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.PropertiesUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class ConnectionPool {

    private final static Logger LOGGER = LogManager.getLogger(ConnectionPool.class);
    private static PropertiesUtil p = new PropertiesUtil("db.properties");
    private static final String URL = p.getStringProperty("url");
    private static final String USER = p.getStringProperty("username");
    private static final String PASSWORD = p.getStringProperty("password");
    private static final Integer SIZE = p.getIntegerProperty("size", 0);
    private static final String DRIVER = p.getStringProperty("driver");
    private final static ConnectionPool INSTANCE = new ConnectionPool();
    private static BlockingQueue<Connection> connections = new ArrayBlockingQueue<>(SIZE);
    private int activeConnections = 0;

    private ConnectionPool() {

    }

    public static ConnectionPool getInstance() {
        return INSTANCE;
    }

    public Connection startConnection() {
        if (activeConnections <= SIZE) {
            try {
                Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                activeConnections++;
                return con;
            } catch (SQLException e) {
                LOGGER.error("ERROR: Could not establish the connection.", e);
                throw new ConnectionPoolException(e);
            }
        } else {
            LOGGER.error("ERROR: Could not create a new connection." +
                    "There are to many active connections");
            throw new ConnectionPoolException();
        }
    }

    public Connection getConnection() {
        if (!connections.isEmpty()) {
            try {
                return connections.take();
            } catch (InterruptedException e) {
                LOGGER.error("ERROR: Could not take a connection from connection pool.", e);
                throw new ConnectionPoolException(e);
            }
        } else {
            return startConnection();
        }
    }

    public void returnConnection(Connection connection) {
        connections.add(connection);
    }
}
