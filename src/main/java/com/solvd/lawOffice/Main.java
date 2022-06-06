package com.solvd.lawOffice;


import com.solvd.lawOffice.binary.lawOfficeStructure.Case;
import com.solvd.lawOffice.binary.lawOfficeStructure.Plaintiff;
import com.solvd.lawOffice.binary.location.Address;
import com.solvd.lawOffice.binary.location.City;
import com.solvd.lawOffice.binary.location.Country;
import com.solvd.lawOffice.binary.payment.Payment;
import com.solvd.lawOffice.binary.people.Client;
import com.solvd.lawOffice.binary.people.Judge;
import com.solvd.lawOffice.services.*;
import com.solvd.lawOffice.services.jackson.EmployeesJackson;
import com.solvd.lawOffice.services.jackson.JudgesJackson;
import com.solvd.lawOffice.services.jackson.LicensesJackson;
import com.solvd.lawOffice.services.jaxb.JaxbImpl;
import com.solvd.lawOffice.services.myBatisImpl.*;
import com.solvd.lawOffice.services.mySqlImpl.ClientServiceImpl;
import com.solvd.lawOffice.utils.MenuService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


public class Main {

    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main (String[] args) {


        // Jaxb Test (Could not use annotations and get Date)

        String path = "src/main/resources/receipts.xml";
        JaxbImpl jaxbRec = new JaxbImpl();
        LOGGER.info("Receipts getted using jaxb xml file:\n"  + jaxbRec.unmarshall(path));

        // Jackson

        EmployeesJackson empJack = new EmployeesJackson();
        JudgesJackson judJack = new JudgesJackson();
        LicensesJackson licJack = new LicensesJackson();
        LOGGER.info("Employees getted by json File:\n" + empJack.getJsonList().toString());
        LOGGER.info("Judges getted by json File:\n" + judJack.getJsonList().toString());
        LOGGER.info("Lawyer Licenses getted by json File:\n" + licJack.getJsonList().toString());

        // My Batis Test (Could not get a client, keep getting null)

       /** ClientService cltServ = new ClientServiceImpl();
       Client clt = cltServ.getClient(5);
       LOGGER.info (clt);

        CountryService counServ = new CountryServiceImpl();
        Country coun = counServ.getCountry(5);

        CityService citServ = new CityServiceImpl();
        City cit = citServ.getCity(4);
        LOGGER.info("City: " + cit.toString());

        AddressService adServ = new AddressServiceImpl();
        Address ad = adServ.getAddress(3);*/

        PaymentService payServ = new PaymentServiceImpl();
        List<Payment> payList = payServ.getByClientId(7);

        // Business Logic (only using jdbc for now)
        MenuService menServ = new MenuService();
        menServ.menuManagement();

    }
}
