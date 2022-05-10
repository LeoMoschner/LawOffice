package com.solvd.lawOffice;


import java.util.List;

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
}
