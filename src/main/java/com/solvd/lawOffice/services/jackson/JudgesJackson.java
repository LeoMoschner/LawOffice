package com.solvd.lawOffice.services.jackson;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.lawOffice.binary.people.Judge;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class JudgesJackson implements IBaseJackson<Judge> {

    private final static Logger LOGGER = LogManager.getLogger(JudgesJackson.class);

    @Override
    public List<Judge> getJsonList(File file) {
        ObjectMapper om = new ObjectMapper();
        try {
            JavaType type = om.getTypeFactory().constructCollectionType(List.class, Judge.class);
            List<Judge> judgesList = om.readValue(file, type);
            return judgesList;
        } catch (IOException e) {
            LOGGER.error("ERROR reading the Json File", e);
            throw new RuntimeException(e);
        }
    }


}
