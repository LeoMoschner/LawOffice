package com.solvd.lawOffice.binary.payment;
import com.solvd.lawOffice.services.jaxb.DateAdapter;


import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

@XmlRootElement(name = "receipt")
public class Receipt {

   // @XmlAttribute (name = "id")
    private long id;
    //@XmlAttribute (name = "from")
    private String from;
    //@XmlAttribute (name = "to")
    private String to;
    //@XmlAttribute (name = "amount")
    private int amount;
    //@XmlJavaTypeAdapter(DateAdapter.class)
    private Date date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {

        return ("Receipt: \n\tId: " + id + "\n\tFrom: " + from
                + "\n\tTo: " + to + "\n\tAmount: $" + amount + "\n\tDate: " + date);
    }

    @Override
    public boolean equals (Object obj){

        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if ((obj instanceof Receipt) && ((Receipt)obj).getId() == this.id) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) this.id;
    }

}
