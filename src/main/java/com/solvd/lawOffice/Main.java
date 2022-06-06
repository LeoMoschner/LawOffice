package com.solvd.lawOffice;

import com.solvd.lawOffice.binary.location.Address;
import com.solvd.lawOffice.binary.location.City;
import com.solvd.lawOffice.services.*;
import com.solvd.lawOffice.services.jackson.EmployeesJackson;
import com.solvd.lawOffice.services.jackson.JudgesJackson;
import com.solvd.lawOffice.services.jackson.LicensesJackson;
import com.solvd.lawOffice.services.jaxb.JaxbImpl;
import com.solvd.lawOffice.services.myBatisImpl.*;
import com.solvd.lawOffice.utils.MenuService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class Main {

    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main (String[] args) {


        // Jaxb Test (Could not use annotations and get Date)

        String path = "src/main/resources/receipts.xml";
        JaxbImpl jaxbRec = new JaxbImpl();
        LOGGER.info("Receipts getted using jaxb xml file:\n"  + jaxbRec.unmarshall(path));

        // Jackson

        String EMPLOYEES_PATH = "src/main/resources/jsonFiles/Employees.json";
        String JUDGE_PATH = "src/main/resources/jsonFiles/Judges.json";
        String LICENSE_PATH = "src/main/resources/jsonFiles/LawyerLicenses.json";
        File empFile = new File(EMPLOYEES_PATH);
        File judFile = new File(JUDGE_PATH);
        File licFile = new File(LICENSE_PATH);

        EmployeesJackson empJack = new EmployeesJackson();
        JudgesJackson judJack = new JudgesJackson();
        LicensesJackson licJack = new LicensesJackson();
        LOGGER.info("Employees getted by json File:\n" + empJack.getJsonList(empFile).toString());
        LOGGER.info("Judges getted by json File:\n" + judJack.getJsonList(judFile).toString());
        LOGGER.info("Lawyer Licenses getted by json File:\n" + licJack.getJsonList(licFile).toString());

        // My Batis Test (Could not get a client, keep getting null)

        CityService citServ = new CityServiceImpl();
        City cit = citServ.getCity(4);
        LOGGER.info("City: " + cit.toString());

        AddressService adServ = new AddressServiceImpl();
        Address ad = adServ.getAddress(3);



        // Business Logic (only using jdbc for now)
        MenuService menServ = new MenuService();
        menServ.menuManagement();

    }
}
