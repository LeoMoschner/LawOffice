package com.solvd.lawOffice.binary.people;

import com.solvd.lawOffice.binary.lawOfficeStructure.License;

public class Lawyer extends Employee {

    private License license;

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    @Override
    public String toString () {
        return ("Lawyer: "  + super.toString() + "\n\tLicense:" + license);
    }

    @Override
    public boolean equals (Object obj){
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Lawyer) && ((Lawyer)obj).getId() == super.getId()) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
