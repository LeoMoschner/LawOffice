package com.solvd.lawOffice.services.jaxb;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;

public class DateAdapter extends XmlAdapter {
    @Override
    public Object unmarshal(Object inputDate) throws Exception {
        return new SimpleDateFormat("DD/MM/YYYY").format(inputDate);
    }

    @Override
    public Object marshal(Object inputDate) throws Exception {

        return new SimpleDateFormat("DD/MM/YYYY").parse((String) inputDate);
    }
}
