package com.solvd.lawOffice.binary;

import org.apache.commons.lang3.time.DateUtils;

public class Payment {
    private long id;
    private int amount;
    private DateUtils date;
    private Receipt receipt;
    private Client client;
    private Employee employee;

    // could combine client and employee to one single field person to pay?

    public Payment() {
    }

    public long getId () {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public DateUtils getDate () {
        return date;
    }

    public void setId (long id) {
        this.id = id;
    }

    public void setAmount (int amount) {
        this.amount = amount;
    }

    public void setDate (DateUtils date) {
        this.date = date;
    }

    @Override
    public String toString () {
        return null;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
