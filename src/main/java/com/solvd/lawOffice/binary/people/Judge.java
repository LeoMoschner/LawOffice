package com.solvd.lawOffice.binary.people;

public class Judge extends Person {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ("Judge: \n\tId: " + id + super.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Judge) && ((Judge) obj).getId() == this.id) {
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
