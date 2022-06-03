package com.solvd.lawOffice.services.jaxb;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;

public class DateAdapter extends XmlAdapter {
    @Override
    public Object unmarshal(Object inputDate) throws Exception {
        return new SimpleDateFormat("dd/MM/yyyy").format(inputDate);
    }

    @Override
    public Object marshal(Object inputDate) throws Exception {

        return new SimpleDateFormat("dd/MM/yyyy").parse((String) inputDate);
    }
}
