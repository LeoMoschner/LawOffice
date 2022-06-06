package com.solvd.lawOffice.services.myBatisImpl;

import com.solvd.lawOffice.binary.lawOfficeStructure.Case;
import com.solvd.lawOffice.binary.location.Address;
import com.solvd.lawOffice.binary.people.Client;
import com.solvd.lawOffice.dao.ICaseDao;
import com.solvd.lawOffice.dao.IClientDao;
import com.solvd.lawOffice.dao.jbdcMySqlImpl.AddressDao;
import com.solvd.lawOffice.dao.jbdcMySqlImpl.CaseDao;
import com.solvd.lawOffice.services.CaseService;
import com.solvd.lawOffice.utils.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CaseServiceImpl implements CaseService {

    private final static Logger LOGGER = LogManager.getLogger(CaseServiceImpl.class);

    @Override
    public Case getCase (long id) {
        try (SqlSession session = SessionFactory.getInstance().getSession()){
            ICaseDao caseDao = session.getMapper(ICaseDao.class);
            Case outputCase = caseDao.getById(id);
            LOGGER.info("Case: " + outputCase);
            return outputCase;
        }
    }
}
