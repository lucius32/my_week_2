package org.example.shopsetting.store;

public abstract class Staff{
    private String name;
    private String identity;
    private String staffId;

    public Staff(String name, String identity, String staffId) {
        this.name = name;
        this.identity = identity;
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }
}
