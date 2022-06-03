package com.solvd.lawOffice.services.jackson;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.lawOffice.binary.lawOfficeStructure.License;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class LicensesJackson implements IBaseJakcson<License> {

    private final static String LICENSE_PATH = "src/main/resources/jsonFiles/LawyerLicenses.json";
    private final static Logger LOGGER = LogManager.getLogger(LicensesJackson.class);

    @Override
    public List<License> getJsonList () {

        ObjectMapper om = new ObjectMapper();
        try {
            JavaType type = om.getTypeFactory().constructCollectionType(List.class, License.class);
            List<License> licensesList = om.readValue(new File(LICENSE_PATH), type);
            return licensesList;
        } catch (IOException e) {
            LOGGER.error("ERROR reading the Json File", e);
            throw new RuntimeException(e);
        }
    }
}
