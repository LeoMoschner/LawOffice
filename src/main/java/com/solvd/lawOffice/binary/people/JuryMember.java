package com.solvd.lawOffice.binary.people;

public class JuryMember extends Person {

    private long id;
    // cases??

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString () {

        return ("Jury Member: \n\tId: " + id + super.toString());
    }

    @Override
    public boolean equals (Object obj){

        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if ((obj instanceof JuryMember) && ((JuryMember)obj).getId() == this.id) {
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
