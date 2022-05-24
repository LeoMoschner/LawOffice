package com.solvd.lawOffice.binary.location;

public class Address {

    private long id;
    private int postalCode;
    private String streetName;
    private int streetNumber;
    private City city;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {

        return ("Address: \n\tId: " + id + "\n\tPostal code: "
                + postalCode + "\n\tStreet: " + streetName + " " + streetNumber
                + "\n\tCity: " + city);
    }

    @Override
    public boolean equals (Object obj){

        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if ((obj instanceof Address) && ((Address)obj).getId() == this.id) {
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
