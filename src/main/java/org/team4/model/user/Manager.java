package org.team4.model.user;

public class Manager extends User{
    private long managerID;

    public Manager(String email, String password, String name, String type) {
        super(email, password, name, type);
    }

    public Manager(String email, String password, String name, String type, long managerID) {
        super(email, password, name, type);
        this.managerID = managerID;
    }

    public long getManagerID() {
        return managerID;
    }

    public void setManagerID(long managerID) {
        this.managerID = managerID;
    }
}
