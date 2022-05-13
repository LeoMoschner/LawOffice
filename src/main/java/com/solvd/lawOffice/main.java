package com.solvd.lawOffice;

import com.solvd.lawOffice.binary.Receipt;
import com.solvd.lawOffice.dao.jbdcMySqlImpl.ReceiptDao;

import java.io.IOException;
import java.sql.SQLException;

public class main {

    public static void main (String[] args) throws IOException, SQLException {

        Receipt receipt = new Receipt();
        Receipt receipt2 = new Receipt();

        ReceiptDao a = new ReceiptDao();

        receipt.setId(8);
        receipt.setTo("John Bull");
        receipt.setFrom("Law Office");
        receipt.setAmount(1234);

        receipt2.setId(8);
        receipt2.setTo("John Toro");
        receipt2.setFrom("Law Office");
        receipt2.setAmount(2238);

        a.update(receipt2);



    }
}
