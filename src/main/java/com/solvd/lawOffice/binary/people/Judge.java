package com.solvd.lawOffice.binary.people;


import com.solvd.lawOffice.binary.lawOfficeStructure.Case;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Judge extends Person {

    private long id;
    private List<Case> cases;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Case> getCases() {
        return cases;
    }

    public void setCases(List<Case> cases) {
        this.cases = cases;
    }

    @Override
    public String toString () {

        AtomicReference<String> auxStr = null;
        cases.stream().forEach( c -> {
            auxStr.set(auxStr.get() + c.getId() + " - ");
        });
        return ("Judge: \n\tId: " + id + super.toString() + auxStr);

    }

    @Override
    public boolean equals (Object obj){

        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if ((obj instanceof Judge) && ((Judge)obj).getId() == this.id) {
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
