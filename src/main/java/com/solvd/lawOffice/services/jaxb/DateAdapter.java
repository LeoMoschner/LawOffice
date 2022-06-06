package com.solvd.lawOffice.services.jaxb;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAdapter extends XmlAdapter<String, Date> {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("DD/MM/YYYY");

    @Override
    public Date unmarshal(String inputDate) throws Exception {
        synchronized (dateFormat) {
            return dateFormat.parse(inputDate);
        }
    }

    @Override
    public String marshal(Date inputDate) throws Exception {
        synchronized (dateFormat) {
            return dateFormat.format(inputDate);
        }
    }
}
