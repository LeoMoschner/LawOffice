package com.solvd.lawOffice.utils;

import com.solvd.lawOffice.binary.lawOfficeStructure.Plaintiff;
import com.solvd.lawOffice.binary.payment.Payment;
import com.solvd.lawOffice.binary.people.Client;
import com.solvd.lawOffice.services.CaseService;
import com.solvd.lawOffice.services.ClientService;
import com.solvd.lawOffice.services.PaymentService;
import com.solvd.lawOffice.services.PlaintiffService;
import com.solvd.lawOffice.services.myBatisImpl.CaseServiceImpl;
import com.solvd.lawOffice.services.myBatisImpl.ClientServiceImpl;
import com.solvd.lawOffice.services.myBatisImpl.PaymentServiceImpl;
import com.solvd.lawOffice.services.myBatisImpl.PlaintiffServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;


public class MenuService {

    private final static Logger LOGGER = LogManager.getLogger(MenuService.class);

    public void menuManagement() {

        Menu loginMenu = new Menu ("Welcome to the SOLVD Law Office" +
                "\n\tPlease enter your client ID.", 10000);
        loginMenu.displayMenu();
        long clientId = loginMenu.getSelection();
        ClientService cltServ = new ClientServiceImpl();
        Client clt = cltServ.getClient(clientId);

        Menu clientMenu = new Menu ("Welcome back: " + clt.getFullName()
                + "\n\t1. Check my info."
                + "\n\t2. View my active cases"
                + "\n\t3. Check my payments",3);

        clientMenu.displayMenu();

        switch (clientMenu.getSelection()) {
            case 1: {
                LOGGER.info(clt.toString());
                break;
            }
            case 2: { //Active cases.
                CaseService caseServ = new CaseServiceImpl();
                PlaintiffService pltfServ = new PlaintiffServiceImpl();
                List<Plaintiff> pltfList = pltfServ.getByClientId(clientId);

                AtomicInteger casesAmount = new AtomicInteger(1);
                AtomicReference<String> clientCasesMenuStatement = new AtomicReference<>("");
                pltfList.stream().forEach(pl -> {

                    clientCasesMenuStatement.set(clientCasesMenuStatement + ("\t" + casesAmount.getAndIncrement() + ". " +
                            caseServ.getCase(pl.getCaseId()).getName() + "\n"));
                });

                Menu clientCasesMenu = new Menu("Active cases of client: " + clt.getFullName()
                                                + "\nSelect one case to check details: \n" + clientCasesMenuStatement.get(), casesAmount.get() - 1);
                clientCasesMenu.displayMenu();

                int caseIndex = clientCasesMenu.getSelection() - 1;
                long caseId = pltfList.get(caseIndex).getCaseId();
                LOGGER.info(caseServ.getCase(caseId).toString());

                break;
            }

            case 3: { // Payments
                PaymentService payServ = new PaymentServiceImpl();
                List<Payment> payList = payServ.getByClientId(clientId);
                LOGGER.info("Payments of Client: " + clt.getFullName());
                payList.stream().forEach(p -> {
                    LOGGER.info(p.toString());
                });
                break;
            }
        }
    }
}
