package com.solvd.lawOffice.services.myBatisImpl;

import com.solvd.lawOffice.binary.payment.Payment;
import com.solvd.lawOffice.dao.IPaymentDao;
import com.solvd.lawOffice.services.PaymentService;
import com.solvd.lawOffice.utils.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class PaymentServiceImpl implements PaymentService {

    private final static Logger LOGGER = LogManager.getLogger(PaymentServiceImpl.class);

    @Override
    public List<Payment> getByClientId (long id) {
        try (SqlSession session = SessionFactory.getInstance().getSession()){
            IPaymentDao payDao = session.getMapper(IPaymentDao.class);
            List<Payment> outputPayList = payDao.getById(id);
            return outputPayList;
        }
    }

    @Override
    public void savePayment(List<Payment> payment) {
        try (SqlSession session = SessionFactory.getInstance().getSession()) {
            IPaymentDao payDao = session.getMapper(IPaymentDao.class);
            payDao.save(payment);
            session.commit();
        }
    }

    @Override
    public void updatePayment (List<Payment> payment) {
        try (SqlSession session = SessionFactory.getInstance().getSession()) {
            IPaymentDao payDao = session.getMapper(IPaymentDao.class);
            payDao.update(payment);
            session.commit();
        }
    }

    @Override
    public void deletePayment (long id) {
        try (SqlSession session = SessionFactory.getInstance().getSession()) {
            IPaymentDao payDao = session.getMapper(IPaymentDao.class);
            payDao.deleteById(id);
            session.commit();
        }
    }
}
