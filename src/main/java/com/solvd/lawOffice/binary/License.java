package com.solvd.lawOffice.binary;

import com.solvd.lawOffice.binary.Employee;
import org.apache.commons.lang3.time.DateUtils;

public class License {

    private long id;
    private DateUtils expDate;
    private Employee employee;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public DateUtils getExpDate() {
        return expDate;
    }

    public void setExpDate(DateUtils expDate) {
        this.expDate = expDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
