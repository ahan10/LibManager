package org.team4.model.user;

public class Manager extends User{
    private long managerID;

    public Manager(String email, String password, String name, String type, boolean validated) {
        super(email, password, name, type);
    }

    public Manager(String email, String password, String name, String type, boolean validated, long managerID) {
        super(email, password, name, type);
        this.managerID = managerID;
    }
}
