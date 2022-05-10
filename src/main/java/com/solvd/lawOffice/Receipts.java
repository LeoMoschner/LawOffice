package com.solvd.lawOffice;

import org.apache.commons.lang3.time.DateUtils;

public class Receipts {

    private long id;
    private String from;
    private String to;
    private int amount;
    private DateUtils date;
    private String concept;             // dont rly know how to call it in english
                                        // makes reference to the products or services that were payed.
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

    public DateUtils getDate() {
        return date;
    }

    public void setDate(DateUtils date) {
        this.date = date;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

}
