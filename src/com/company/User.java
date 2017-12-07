<<<<<<< HEAD
package com.company;

/**
 * Created by adakuuchendu on 12/5/17.
 */


 interface userInterface {
    String getUserID();
    String getUserFile();
    void setUserFile(String user);
    void setUserID(String iD);

}


 class User implements userInterface{
    String iD;
    String userFile;

    //no-arg constructor
    public User() {
        iD = "00";
        userFile = "C:\\PlanIt\\Users\\00.txt.";
    }

    public void setUserFile(String user) {
        userFile = user;
    }
    public void setUserID(String iD) {
        this.iD = iD;
    }
    public String getUserFile() {
        return userFile;
    }
    public String getUserID() {
        return iD;
    }
=======
package dpractice;

public class Users2 {

	private String Name;
	private String Email;
	private String Password;

	public Users2(String name, String email, String password) {
		super();
		this.Name = name;
		this.Email = email;
		this.Password = password;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

>>>>>>> dc46129930bba6724094bea59ee01ade177b109d
}
