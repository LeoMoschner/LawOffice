package com.solvd.lawOffice.services.myBatisImpl;

import com.solvd.lawOffice.binary.lawOfficeStructure.Case;
import com.solvd.lawOffice.binary.lawOfficeStructure.Plaintiff;
import com.solvd.lawOffice.dao.ICaseDao;
import com.solvd.lawOffice.dao.IPlaintiffDao;
import com.solvd.lawOffice.services.PlaintiffService;
import com.solvd.lawOffice.utils.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class PlaintiffServiceImpl implements PlaintiffService {

    private final static Logger LOGGER = LogManager.getLogger(PlaintiffServiceImpl.class);

    @Override
    public List<Plaintiff> getByClientId (long id) {
        try (SqlSession session = SessionFactory.getInstance().getSession()){
            IPlaintiffDao pltfDao = session.getMapper(IPlaintiffDao.class);
            List<Plaintiff> outputPltfList = pltfDao.getById(id);
            LOGGER.info("Plaintiff " + outputPltfList);
            return outputPltfList;
        }
    }
}
