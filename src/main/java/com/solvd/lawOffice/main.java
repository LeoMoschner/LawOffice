package com.solvd.lawOffice;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.lawOffice.binary.lawOfficeStructure.License;
import com.solvd.lawOffice.services.MenuService;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class main {

    public static void main (String[] args) {

        ObjectMapper om = new ObjectMapper();

        try {
            JavaType type = om.getTypeFactory().constructCollectionType(List.class, License.class);
            List<License> licenses = om.readValue(new File("src/main/resources/LawyerLicenses.json"), type);

        } catch (StreamReadException e) {
            e.printStackTrace();
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        MenuService menServ = new MenuService();
        menServ.menuManagment();

    }
}
