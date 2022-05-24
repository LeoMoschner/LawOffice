package com.solvd.lawOffice.dao.jbdcMySqlImpl;

import com.solvd.lawOffice.binary.people.Client;
import com.solvd.lawOffice.dao.IClientDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ClientDao extends AbstractDao implements IClientDao {

    private static final Logger LOGGER = LogManager.getLogger(ClientDao.class);
    private static final String SELECT_BY_ID = "SELECT * from clients WHERE id_clients = ?";
    private static final String CREATE_NEW = "INSERT INTO clients (`id_clients`, `first_name`, `last_name`, `email`, `Address_id_Address`) " +
                                                "VALUES (?, ?, ?, ?, ?)";
    private final static String UPDATE = "UPDATE clients SET `first_name` = ?, `last_name` = ?, `email` = ?, `Address_id_Address` = ? " +
            "WHERE `id_clients` = ?";
    private final static String DELETE_BY_ID = "DELETE from clients WHERE id_Clients = ?";


    @Override
    public Client getById(long id)  {

        PreparedStatement pr = null;
        ResultSet rs = null;
        Connection con = getConnection();

        try {

            pr = con.prepareStatement(SELECT_BY_ID);
            pr.setLong(1, id);
            rs = pr.executeQuery();
            rs.next();

            Client cl = new Client();
            cl.setId(rs.getLong("id_clients"));
            cl.setFirstName(rs.getString("first_name"));
            cl.setLastName(rs.getString("last_name"));
            cl.setEmail(rs.getString("email"));
            AddressDao ad = new AddressDao();
            cl.setAddress(ad.getById(rs.getLong("Address_id_Address")));
            return cl;

        }catch (SQLException e) {

            LOGGER.error("ERROR: Could not return client with id: " + id, e);
            throw new RuntimeException();
        }finally {
            returnConnection(con);
            closeResources(pr,rs);
        }
    }

    @Override
    public void save (Client client) {

        PreparedStatement pr = null;
        Connection con = getConnection();
        try {

            pr = con.prepareStatement(CREATE_NEW);
            pr.setLong(1, client.getId());
            pr.setString(2, client.getFirstName());
            pr.setString(3, client.getLastName());
            pr.setString(4, client.getEmail());
            pr.setLong(5, client.getAddress().getId());
            pr.execute();
            LOGGER.info("New Client added correctly to Data Base. \n\t" + client);

        }catch (SQLException e) {
            LOGGER.error("ERROR: Could not save the client", e);
            throw new RuntimeException();
        }finally {
            returnConnection(con);
            closeResources(pr);
        }

    }

    @Override
    public void update (Client client) {

        PreparedStatement pr = null;
        Connection con = getConnection();

        try {

            pr = con.prepareStatement(UPDATE);
            pr.setLong(5, client.getId());
            pr.setString(1, client.getFirstName());
            pr.setString(2, client.getLastName());
            pr.setString(3, client.getEmail());
            pr.setLong(4, client.getAddress().getId());
            pr.execute();
            LOGGER.info("Client updated successfully.");

        }catch (SQLException e) {
            LOGGER.error("ERROR: Could not update the client.");
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
            LOGGER.info("Client deleted successfully.");

        }catch (SQLException e) {
            LOGGER.error("ERROR: Could not delete the client." , e);
            throw new RuntimeException(e);
        }finally {
            returnConnection(con);
            closeResources(pr);
        }
    }
}
