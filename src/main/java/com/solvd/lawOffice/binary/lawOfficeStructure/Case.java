package com.solvd.lawOffice.binary.lawOfficeStructure;

import com.solvd.lawOffice.binary.people.Judge;

public class Case {

    private long id;
    private String name;
    private String defendant;
    private Court court;
    private Judge judge;

    public Case() {
    }

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

    public String getDefendant() {
        return defendant;
    }

    public void setDefendant(String defendant) {
        this.defendant = defendant;
    }

    public Court getCourt() {
        return court;
    }

    public void setCourt(Court court) {
        this.court = court;
    }

    public Judge getJudge () {
        return judge;
    }

    public void setJudge (Judge judge) {
        this.judge = judge;
    }

    @Override
    public String toString () {

        return ("Case: \n\tId: " + id + "\n\tName: " + name + "\n\tDefendant: " +
                defendant + "\n\tCourt: " + court.getName()
                + "\n\tJudge: " + judge.getFullName());
    }

    @Override
    public boolean equals (Object obj){

        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if ((obj instanceof Case) && ((Case)obj).getId() == this.id) {
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
