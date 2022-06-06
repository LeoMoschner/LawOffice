package com.solvd.lawOffice.binary.payment;

import com.solvd.lawOffice.binary.people.Client;
import com.solvd.lawOffice.binary.people.Employee;
import org.apache.commons.lang3.time.DateUtils;

public class Payment {
    private long id;
    private int amount;
    private DateUtils date;
    private Receipt receipt;
    private Client client;
    private Employee employee;

    public Payment() {
    }

    public long getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public DateUtils getDate() {
        return date;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDate(DateUtils date) {
        this.date = date;
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

    @Override
    public String toString() {
        String auxStr = "Payment: \n\tId: " + id + "\n\tAmount: $" + amount
                + "\n\tDate: " + date + "\n\tReceipt Id: " + receipt.getId();
        if (client != null) {
            auxStr = auxStr + ("\n\tClient: " + client.getFullName());
        } else {
            auxStr = auxStr + ("\n\tEmployee: " + employee.getFullName());
        }
        return auxStr;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Payment) && ((Payment) obj).getId() == this.id) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) this.id;
    }
}
