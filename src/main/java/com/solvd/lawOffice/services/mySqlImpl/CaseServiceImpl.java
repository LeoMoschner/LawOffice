package com.solvd.lawOffice.services.mySqlImpl;

import com.solvd.lawOffice.binary.lawOfficeStructure.Case;
import com.solvd.lawOffice.dao.jbdcMySqlImpl.CaseDao;
import com.solvd.lawOffice.services.CaseService;

public class CaseServiceImpl implements CaseService {

    @Override
    public Case getCase(long id) {
        CaseDao caseDao = new CaseDao();
        return caseDao.getById(id);
    }

    @Override
    public void saveCase(Case cas) {
        CaseDao caseDao = new CaseDao();
        caseDao.save(cas);
    }

    @Override
    public void updateCase(Case cas) {
        CaseDao caseDao = new CaseDao();
        caseDao.update(cas);
    }

    @Override
    public void deleteCase (long id) {
        CaseDao caseDao = new CaseDao();
        caseDao.deleteById(id);
    }
}
