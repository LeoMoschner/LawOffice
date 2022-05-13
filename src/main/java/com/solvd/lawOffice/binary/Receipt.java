package com.solvd.lawOffice.binary;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Receipt {

    private long id;
    private String from;
    private String to;
    private int amount;
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

}
