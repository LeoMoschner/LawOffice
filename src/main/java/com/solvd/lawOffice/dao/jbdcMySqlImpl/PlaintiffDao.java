package com.solvd.lawOffice.dao.jbdcMySqlImpl;

import com.solvd.lawOffice.binary.lawOfficeStructure.Plaintiff;
import com.solvd.lawOffice.dao.IPlaintiffDao;
import com.solvd.lawOffice.utils.exceptions.DaoException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlaintiffDao extends AbstractDao implements IPlaintiffDao {

    private final static Logger LOGGER = LogManager.getLogger(PlaintiffDao.class);
    private final static String SELECT_BY_CLIENT_ID = "SELECT * FROM plaintiffies WHERE Clients_id_Clients = ?";

    @Override
    public List<Plaintiff> getById(long clientId) {
        PreparedStatement pr = null;
        ResultSet rs = null;
        Connection con = getConnection();
        try {
            pr = con.prepareStatement(SELECT_BY_CLIENT_ID);
            pr.setLong(1, clientId);
            rs = pr.executeQuery();
            List<Plaintiff> pltfList = new ArrayList<>();
            while (rs.next()) {
                Plaintiff pltf = new Plaintiff();
                pltf.setId(rs.getLong("id_Demandent"));
                pltf.setClientId(rs.getLong("Clients_id_clients"));
                pltf.setCaseId(rs.getLong("Cases_id_Cases"));
                pltfList.add(pltf);
            }
            return pltfList;
        } catch (SQLException e) {
            LOGGER.error("ERROR: Could not return plaintiffs list");
            throw new DaoException(e);
        } finally {
            returnConnection(con);
            closeResources(pr, rs);
        }
    }
}
