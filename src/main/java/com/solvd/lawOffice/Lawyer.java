package com.solvd.lawOffice;

public class Lawyer extends Employee {

    private License License;

    public License getLicense() {
        return License;
    }

    public void setLicense(License license) {
        License = license;
    }
}
