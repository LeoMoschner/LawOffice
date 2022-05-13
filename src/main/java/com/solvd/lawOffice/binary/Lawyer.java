package com.solvd.lawOffice.binary;

public class Lawyer extends Employee {

    private com.solvd.lawOffice.binary.License License;

    public License getLicense() {
        return License;
    }

    public void setLicense(License license) {
        License = license;
    }
}
