package com.solvd.lawOffice.services.myBatisImpl;

import com.solvd.lawOffice.binary.lawOfficeStructure.Case;
import com.solvd.lawOffice.dao.ICaseDao;
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
            return outputCase;
        }
    }

    @Override
    public void saveCase(Case cas) {
        try (SqlSession session = SessionFactory.getInstance().getSession()) {
            ICaseDao casDao = session.getMapper(ICaseDao.class);
            casDao.save(cas);
            session.commit();
        }
    }

    @Override
    public void updateCase (Case cas) {
        try (SqlSession session = SessionFactory.getInstance().getSession()) {
            ICaseDao casDao = session.getMapper(ICaseDao.class);
            casDao.update(cas);
            session.commit();
        }
    }

    @Override
    public void deleteCase (long id) {
        try (SqlSession session = SessionFactory.getInstance().getSession()) {
            ICaseDao casDao = session.getMapper(ICaseDao.class);
            casDao.deleteById(id);
            session.commit();
        }
    }
}
