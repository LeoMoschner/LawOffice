package com.solvd.lawOffice.utils;

import com.solvd.lawOffice.binary.lawOfficeStructure.Plaintiff;
import com.solvd.lawOffice.binary.payment.Payment;
import com.solvd.lawOffice.binary.people.Client;
import com.solvd.lawOffice.services.CaseService;
import com.solvd.lawOffice.services.ClientService;
import com.solvd.lawOffice.services.PaymentService;
import com.solvd.lawOffice.services.PlaintiffService;
import com.solvd.lawOffice.services.jackson.EmployeesJackson;
import com.solvd.lawOffice.services.jackson.JudgesJackson;
import com.solvd.lawOffice.services.jackson.LicensesJackson;
import com.solvd.lawOffice.services.jaxb.JaxbImpl;
import com.solvd.lawOffice.services.myBatisImpl.CaseServiceImpl;
import com.solvd.lawOffice.services.myBatisImpl.ClientServiceImpl;
import com.solvd.lawOffice.services.myBatisImpl.PaymentServiceImpl;
import com.solvd.lawOffice.services.myBatisImpl.PlaintiffServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;


public class MenuService {

    private final static Logger LOGGER = LogManager.getLogger(MenuService.class);
    private final String EMPLOYEES_JACKSON = "src/main/resources/jsonFiles/Employees.json";
    private final String JUDGE_JACKSON = "src/main/resources/jsonFiles/Judges.json";
    private final String LICENSE_JACKSON = "src/main/resources/jsonFiles/LawyerLicenses.json";
    private final String RECEIPTS_JAXB = "src/main/resources/receipts.xml";

    public boolean menuManagement() {
        Menu exitMenu = new Menu("Dou you want to exit the program? \n" +
                "\t1. Yes.\n" +
                "\t2. No, take me back to the beginning.", 2);

        Menu loginMenu = new Menu("Welcome to SOLVD Law Office. Please select your login access level:"
                + "\n\t1. Manager (owner)."
                + "\n\t2. Client.", 2);
        loginMenu.displayMenu();
        int accessLevel = loginMenu.getSelection();
        // JACKSON AND JAXB USAGE IN BUSINESS LOGIC.
        if (accessLevel == 1) {
            Menu managerMenu = new Menu("Please select an option:"
                    + "\n\t1. View judges list."
                    + "\n\t2. View employees list."
                    + "\n\t3. View lawyer licenses list."
                    + "\n\t4. View receipts", 4);
            managerMenu.displayMenu();
            switch (managerMenu.getSelection()) {
                case 1: {
                    File judFile = new File(JUDGE_JACKSON);
                    JudgesJackson judJack = new JudgesJackson();
                    LOGGER.info("Judges List: " + judJack.getJsonList(judFile).toString());
                    break;
                }
                case 2: {
                    File empFile = new File(EMPLOYEES_JACKSON);
                    EmployeesJackson empJack = new EmployeesJackson();
                    LOGGER.info("Employees List:\n" + empJack.getJsonList(empFile).toString());
                    break;
                }
                case 3: {
                    File licFile = new File(LICENSE_JACKSON);
                    LicensesJackson licJack = new LicensesJackson();
                    LOGGER.info("Lawyer Licenses List:\n" + licJack.getJsonList(licFile).toString());
                    break;
                }
                case 4: {
                    JaxbImpl jaxbRec = new JaxbImpl();
                    LOGGER.info("Receipts:\n" + jaxbRec.unmarshall(RECEIPTS_JAXB));
                }
            }
        } else {
            // Client Menu.
            Menu clientIDMenu = new Menu("Please enter your client ID.", 10000);
            clientIDMenu.displayMenu();
            long clientId = clientIDMenu.getSelection();
            ClientService cltServ = new ClientServiceImpl();
            Client clt = cltServ.getClient(clientId);
            Menu clientMenu = new Menu("Welcome back: " + clt.getFullName()
                    + "\n\t1. Check my info."
                    + "\n\t2. View my active cases"
                    + "\n\t3. Check my payments", 3);

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
        exitMenu.displayMenu();
        return (exitMenu.getSelection() != 1);
    }
}
