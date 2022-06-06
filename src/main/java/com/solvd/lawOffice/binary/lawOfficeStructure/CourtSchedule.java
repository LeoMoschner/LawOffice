package com.solvd.lawOffice.binary.lawOfficeStructure;

import com.solvd.lawOffice.binary.people.Judge;
import org.apache.commons.lang3.time.DateUtils;

public class CourtSchedule {

    private long id;
    private Court court;
    private Judge judge;
    private DateUtils dateAndTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Court getCourt() {
        return court;
    }

    public void setCourt(Court court) {
        this.court = court;
    }

    public Judge getJudge() {
        return judge;
    }

    public void setJudge(Judge judge) {
        this.judge = judge;
    }

    public DateUtils getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(DateUtils dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    @Override
    public String toString() {
        return ("Court schedule: \n\tId: " + id + "\n\tCourt: " + court.getName() + "\n\tJudge: " + judge.getFullName() + "\n\tDate and time: " + dateAndTime);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CourtSchedule) && ((CourtSchedule) obj).getId() == this.id) {
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
