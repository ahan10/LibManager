package org.team4.model.user;

public class User {
    private String email;
    private String password;
    private String name;
    private String type;
    private boolean validated;

    public User(String email, String password, String name, String type) {
        this.setEmail(email);
        this.setPassword(password);
        this.setName(name);
        this.setType(type);
        if(type.equals("VISITOR")){
            this.setValidated(true);
        }else{
            this.setValidated(false);
        }
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isValidated() {
		return validated;
	}

	public void setValidated(boolean validated) {
		this.validated = validated;
	}

}
