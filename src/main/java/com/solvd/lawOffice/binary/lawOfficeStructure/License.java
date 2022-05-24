package com.solvd.lawOffice.binary.lawOfficeStructure;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.solvd.lawOffice.binary.people.Employee;

import java.util.Date;

public class License {

    @JsonProperty ("id")
    private long id;

    @JsonProperty ("ExpDate")
    private Date expDate;

    @JsonProperty ("Employee")
    private Employee employee;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {

        return ("Lawyer license: \n\tId: " + id + "\n\tExpiration date: " + expDate);
    }

    @Override
    public boolean equals (Object obj){

        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if ((obj instanceof License) && ((License)obj).getId() == this.id) {
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
