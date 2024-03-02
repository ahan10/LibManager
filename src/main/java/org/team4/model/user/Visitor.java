package org.team4.model.user;

public class Visitor extends User{
    public Visitor(String email, String password, String name, String type) {
        super(email, password, name, type);
    }

    //ONLY TO BE USED BY MAINTAIN USER
    public Visitor(String email, String password, String name, String type, boolean validated) {
        super(email, password, name, type, validated);
    }
}
