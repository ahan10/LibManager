package org.team4.model.user;

public class NonFaculty extends User {
    private long universityID;

    public NonFaculty(String email, String password, String name, String type, boolean validated, long universityID) {
        super(email, password, name, type, validated);
        this.universityID = universityID;
    }


    public long getUniversityID() {
        return universityID;
    }

    public void setUniversityID(long universityID) {
        this.universityID = universityID;
    }


}
