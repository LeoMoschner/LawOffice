package com.solvd.lawOffice.services.mySqlImpl;

import com.solvd.lawOffice.binary.payment.Payment;
import com.solvd.lawOffice.dao.jbdcMySqlImpl.PaymentDao;
import com.solvd.lawOffice.services.PaymentService;

import java.util.List;

public class PaymentServiceImpl implements PaymentService {

    @Override
    public List<Payment> getByClientId(long clientId) {
        PaymentDao payDao = new PaymentDao();
        return payDao.getById(clientId);
    }

    public void savePayment(List<Payment> payment) {
        PaymentDao payDao = new PaymentDao();
        payDao.save(payment);
    }

    public void updatePayment(List<Payment> payment) {
        PaymentDao payDao = new PaymentDao();
        payDao.update(payment);
    }

    public void deletePayment(long id) {
        PaymentDao payDao = new PaymentDao();
        payDao.deleteById(id);
    }
}
