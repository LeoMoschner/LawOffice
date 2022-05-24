package com.solvd.lawOffice.services;

import com.solvd.lawOffice.binary.payment.Payment;

import java.util.List;

public interface PaymentService {

    default List<Payment> getByClientId (long clientId){
        return null;
    }
}
