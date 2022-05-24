package com.solvd.lawOffice.services.mySqlImpl;

import com.solvd.lawOffice.binary.lawOfficeStructure.Case;
import com.solvd.lawOffice.dao.jbdcMySqlImpl.CaseDao;
import com.solvd.lawOffice.services.CaseService;

public class CaseServiceImpl implements CaseService {

    @Override
    public Case getById(long id) {
        CaseDao caseDao = new CaseDao();
        return caseDao.getById(id);
    }
}
