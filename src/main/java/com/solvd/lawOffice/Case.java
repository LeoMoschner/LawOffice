package com.solvd.lawOffice;

import java.util.List;

public class Case {

    private long id;
    private String name;
    // defendant;           add defendant table to DB?
    // court
    // plaintiffies;
    private List<JuryMember> juryMembers;
    private List <CaseDocument> caseDocuments;

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


    public List<JuryMember> getJuryMembers() {
        return juryMembers;
    }

    public void setJuryMembers(List<JuryMember> juryMembers) {
        this.juryMembers = juryMembers;
    }

    public List<CaseDocument> getCaseDocuments() {
        return caseDocuments;
    }

    public void setCaseDocuments(List<CaseDocument> caseDocuments) {
        this.caseDocuments = caseDocuments;
    }
}
