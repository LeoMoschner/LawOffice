package com.solvd.lawOffice.binary.lawOfficeStructure;

import com.solvd.lawOffice.binary.people.Employee;

import java.util.List;

public class CaseOrders {
    private long id;
    private Case aCase;
    private List<Employee> employees;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Case getaCase() {
        return aCase;
    }

    public void setaCase(Case aCase) {
        this.aCase = aCase;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString () {

        final String[] empStr = {("Employees: ")};

        employees.stream().forEach(emp -> {
            empStr[0] = (empStr[0] + emp.getFullName() + " ");
        });

        return ("Case oders: \n\tId: " + id + "\n\tCase Id: " + aCase.getId()
                + empStr);
    }

    @Override
    public boolean equals (Object obj){

        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if ((obj instanceof CaseOrders) && ((CaseOrders)obj).getId() == this.id) {
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
