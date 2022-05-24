package com.solvd.lawOffice.services.jaxb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbImpl implements JaxbService{

    private final static Logger LOGGER = LogManager.getLogger(JaxbImpl.class);

    @Override
    public Object unmarshall(String path) {

        File dataFile = new File (path);
        JAXBContext jaxbCon;
        try {
            jaxbCon = JAXBContext.newInstance(Object.class);
            Unmarshaller unm = jaxbCon.createUnmarshaller();
            return unm.unmarshal(dataFile);

        }catch (JAXBException e) {

            LOGGER.error("ERROR: Could not complete the Jaxb operation", e);
            throw new RuntimeException(e);
        }
    }

    public void marshall (Object obj, String resultPath) {

        File result = new File (resultPath);
        JAXBContext jaxbCon;

        try {
            jaxbCon = JAXBContext.newInstance(this.getClass());
            Marshaller marsh = jaxbCon.createMarshaller();
            marsh.marshal(obj, result);
        }catch (JAXBException e) {

            LOGGER.error ("ERROR: Could not complete the Jaxb operation", e);
            throw new RuntimeException(e);
        }
    }
}
