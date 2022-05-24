package com.solvd.lawOffice.binary.lawOfficeStructure;

public class Plaintiff {

    private long id;
    private long clientId;
    private long caseId;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public long getCaseId() {
        return caseId;
    }

    public void setCaseId(long caseId) {
        this.caseId = caseId;
    }

    @Override
    public String toString () {

        return ("Plaintiff: \n\tId: " + id + "\n\tClient Id: " + clientId
                + "\n\tCase Id: " + caseId);
    }
}
