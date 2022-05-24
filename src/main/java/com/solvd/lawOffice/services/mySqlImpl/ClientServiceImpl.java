package com.solvd.lawOffice.services.mySqlImpl;

import com.solvd.lawOffice.binary.people.Client;
import com.solvd.lawOffice.dao.jbdcMySqlImpl.ClientDao;
import com.solvd.lawOffice.services.ClientService;


public class ClientServiceImpl implements ClientService {



    @Override

    public Client getClient (long id) {

        ClientDao clDao = new ClientDao();
        return clDao.getById(id);
    }

    public void saveClient (Client client) {

        ClientDao clDao = new ClientDao();
        clDao.save(client);
    }
}
