package org.team4.model.user;

public class UserFactory {
    public UserFactory(){

    }

    public User getUser(String email, String password, String name, String type){
        if(type.equals("STUDENT")){
            return new Student(email, password, name, type);
        }else if(type.equals("FACULTY")){
            return new Faculty(email, password, name, type);
        }else if(type.equals("NONFACULTY")){
            return new NonFaculty(email, password, name, type);
        }else if(type.equals("MANAGER")){
            return new Manager(email, password, name, type);
        }else if(type.equals("VISITOR")){
            return new Visitor(email, password, name, type);
        }
        return null;
    }

    //ONLY TO BE USED BY MAINTAIN USER
    public User getUser(String email, String password, String name, String type, boolean validated){
        if(type.equals("STUDENT")){
            return new Student(email, password, name, type, validated);
        }else if(type.equals("FACULTY")){
            return new Faculty(email, password, name, type, validated);
        }else if(type.equals("NONFACULTY")){
            return new NonFaculty(email, password, name, type, validated);
        }else if(type.equals("MANAGER")){
            return new Manager(email, password, name, type, validated);
        }else if(type.equals("VISITOR")){
            return new Visitor(email, password, name, type, validated);
        }
        return null;
    }
}
