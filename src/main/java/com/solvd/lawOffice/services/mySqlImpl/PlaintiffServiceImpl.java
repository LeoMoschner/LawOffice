package com.solvd.lawOffice.services.mySqlImpl;

import com.solvd.lawOffice.binary.lawOfficeStructure.Plaintiff;
import com.solvd.lawOffice.dao.jbdcMySqlImpl.PlaintiffDao;
import com.solvd.lawOffice.services.PlaintiffService;

import java.util.List;

public class PlaintiffServiceImpl implements PlaintiffService {

    @Override
    public List<Plaintiff> getByClientId(long clientId) {
        PlaintiffDao pltfDao = new PlaintiffDao();
        return pltfDao.getById(clientId);
    }

    public void savePlaintiff(List<Plaintiff> plaintiffs) {
        PlaintiffDao pltfDao = new PlaintiffDao();
        pltfDao.save(plaintiffs);
    }

    public void updatePlaintiff(List<Plaintiff> plaintiffs) {
        PlaintiffDao pltfDao = new PlaintiffDao();
        pltfDao.update(plaintiffs);
    }

    public void deletePlaintiff(long id) {
        PlaintiffDao pltfDao = new PlaintiffDao();
        pltfDao.deleteById(id);
    }

}
