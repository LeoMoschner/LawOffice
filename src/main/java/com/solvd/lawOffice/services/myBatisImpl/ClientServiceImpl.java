package com.solvd.lawOffice.services.myBatisImpl;

import com.solvd.lawOffice.binary.people.Client;
import com.solvd.lawOffice.dao.IClientDao;
import com.solvd.lawOffice.services.ClientService;
import com.solvd.lawOffice.utils.SessionFactory;

import org.apache.ibatis.session.SqlSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class ClientServiceImpl implements ClientService {

    private final static Logger LOGGER = LogManager.getLogger(ClientServiceImpl.class);

    @Override
    public Client getClient (long id) {
        try (SqlSession session = SessionFactory.getInstance().getSession()){
            IClientDao cltDao = session.getMapper(IClientDao.class);
            Client outputClt = cltDao.getById(id);
            LOGGER.info("CLIENT: " + outputClt);
            return outputClt;
        }
    }

}
