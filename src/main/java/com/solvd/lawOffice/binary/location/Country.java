package com.solvd.lawOffice.binary.location;


public class Country {
    private long id;
    private String name;

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

    @Override
    public String toString () {
        return name;
    }

    @Override
    public boolean equals (Object obj){

        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if ((obj instanceof Country) && ((Country)obj).getId() == this.id) {
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
