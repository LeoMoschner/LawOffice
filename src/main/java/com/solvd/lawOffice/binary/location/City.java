package com.solvd.lawOffice.binary.location;


public class City {

    private long id;
    private String name;
    private Country country;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return (name + " - " + this.country.toString());
    }

    @Override
    public boolean equals (Object obj){

        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if ((obj instanceof City) && ((City)obj).getId() == this.id) {
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
