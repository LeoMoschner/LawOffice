package com.solvd.lawOffice.services.mySqlImpl;

import com.solvd.lawOffice.binary.payment.Payment;
import com.solvd.lawOffice.dao.jbdcMySqlImpl.PaymentDao;
import com.solvd.lawOffice.services.PaymentService;

import java.util.List;

public class PaymentServiceImpl implements PaymentService {

    @Override
    public List<Payment> getByClientId (long clientId) {
        PaymentDao payDao = new PaymentDao();
        return payDao.getById(clientId);
    }
}
