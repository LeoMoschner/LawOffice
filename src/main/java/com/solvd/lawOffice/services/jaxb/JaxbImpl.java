package com.solvd.lawOffice.services.jaxb;

import com.solvd.lawOffice.binary.payment.Receipt;
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
    public Receipt unmarshall(String path) {

        File dataFile = new File (path);
        JAXBContext jaxbCon;
        try {
            jaxbCon = JAXBContext.newInstance(Receipt.class);
            Unmarshaller unm = jaxbCon.createUnmarshaller();
            return (Receipt) unm.unmarshal(dataFile);

        }catch (JAXBException e) {

            LOGGER.error("ERROR: Could not complete the Jaxb operation", e);
            throw new RuntimeException(e);
        }
    }

    public void marshall (Receipt receipt, String resultPath) {

        File result = new File (resultPath);
        JAXBContext jaxbCon;

        try {
            jaxbCon = JAXBContext.newInstance(this.getClass());
            Marshaller marsh = jaxbCon.createMarshaller();
            marsh.marshal(receipt, result);
        }catch (JAXBException e) {

            LOGGER.error ("ERROR: Could not complete the Jaxb operation", e);
            throw new RuntimeException(e);
        }
    }
}
