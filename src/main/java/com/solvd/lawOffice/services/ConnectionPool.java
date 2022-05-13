package com.solvd.lawOffice.services;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionPool {

    public static Connection ConnectToDb () throws IOException, SQLException {

        FileReader reader = new FileReader("src/main/resources/db.properties");
        Properties p = new Properties();
        p.load(reader);

        String url = p.getProperty("url");
        String user = p.getProperty("username");
        String password = p.getProperty("password");

       Connection con = DriverManager.getConnection(url, user, password);
       return con;

    }
}
