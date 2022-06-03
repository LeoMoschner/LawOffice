package com.solvd.lawOffice.services.myBatisImpl;

import com.solvd.lawOffice.binary.people.Client;
import com.solvd.lawOffice.dao.IClientDao;
import com.solvd.lawOffice.services.ClientService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.Reader;

public class ClientServiceImpl implements ClientService {

    private final static Logger LOGGER = LogManager.getLogger(ClientServiceImpl.class);

    @Override
    public Client getClient (long id) {

        try {
            Reader rd = Resources.getResourceAsReader("myBatis/mybatis-config.xml");
            SqlSessionFactory sqlSesFac = new SqlSessionFactoryBuilder().build(rd);
            IClientDao cltDao = sqlSesFac.openSession().getMapper(IClientDao.class);
            Client outputClt = cltDao.getById(id);
            LOGGER.info("CLIENT: " + outputClt);
            return outputClt;

        } catch (IOException e) {
            LOGGER.error("ERROR: There was an error with my batis", e);
            throw new RuntimeException(e);
        }
    }

}
