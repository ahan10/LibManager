package org.team4.model.user;

public class User {
    private String email;
    private String password;
    private String name;
    private String type;
    private boolean validated;
//    - credentials: Credentials


    public User(String email, String password, String name, String type, boolean validated) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.type = type;
        this.validated = false;
    }

}
