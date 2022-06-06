package com.solvd.lawOffice.binary.lawOfficeStructure;

public class CaseDocument {

    private long id;
    private String name;
    private String desc;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {

        return ("Case Document:" + "\n\tId: " + id + "\n\t Name: " + name + "\n\t Description: " + desc);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if ((obj instanceof CaseDocument) && ((CaseDocument) obj).getId() == this.id) {
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
