package com.solvd.lawOffice.services.jackson;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.lawOffice.binary.people.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class EmployeesJackson implements IBaseJackson<Employee> {

    private final static Logger LOGGER = LogManager.getLogger(EmployeesJackson.class);

    @Override
    public List<Employee> getJsonList(File file) {
        ObjectMapper om = new ObjectMapper();
        try {
            JavaType type = om.getTypeFactory().constructCollectionType(List.class, Employee.class);
            List<Employee> employeesList = om.readValue(file, type);
            return employeesList;
        } catch (IOException e) {
            LOGGER.error("ERROR reading the Json File", e);
            throw new RuntimeException(e);
        }
    }
}
