package com.solvd.lawOffice.services;

import com.solvd.lawOffice.binary.payment.Receipt;

public interface ReceiptService {

    default Receipt getReceipt(long id) {
        return null;
    }

}
