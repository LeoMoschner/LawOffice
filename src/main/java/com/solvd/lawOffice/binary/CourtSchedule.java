package com.solvd.lawOffice.binary;

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
}
