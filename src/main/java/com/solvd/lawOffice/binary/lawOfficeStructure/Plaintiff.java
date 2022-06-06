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
    public String toString() {
        return ("Plaintiff: \n\tId: " + id + "\n\tClient Id: " + clientId
                + "\n\tCase Id: " + caseId);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Plaintiff) && ((Plaintiff) obj).getId() == this.id) {
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
