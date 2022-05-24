package com.solvd.lawOffice.services.mySqlImpl;

import com.solvd.lawOffice.binary.payment.Receipt;
import com.solvd.lawOffice.dao.jbdcMySqlImpl.ReceiptDao;
import com.solvd.lawOffice.services.ReceiptService;

public class ReceiptServiceImpl implements ReceiptService {

    @Override
    public Receipt getReceipt(long id) {

        ReceiptDao recDao = new ReceiptDao();
        return recDao.getById(id);
    }
}
