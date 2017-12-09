<<<<<<< HEAD
package com.company;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
/*Adaku Uchendu
   Buban Ndeta
   Steven Sommers
   Yeabi Demissie
   Tony Smith
   Akhil Naraparaju
   THIS CLASS CONTAINS ANY METHOD WHERE FILE WRITING IS REQUIRED
  THIS INCLUDES SCHEDULE CREATION AND DELETION
  AS WELL AS PASSWORD GENERATION AND ASSIGNMENT
*/

interface userInterface {
=======
<<<<<<< HEAD
package com.company;

=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
/**
 * Created by adakuuchendu on 12/5/17.
 */


 interface userInterface {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
    String getUserID();
    String getUserFile();
    void setUserFile(String user);
    void setUserID(String iD);

}


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
class User implements userInterface {
=======
 class User implements userInterface{
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
 class User implements userInterface{
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
 class User implements userInterface{
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
 class User implements userInterface{
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
    String iD;
    String userFile;

    //no-arg constructor
    public User() {
        iD = "00";
        userFile = "C:\\PlanIt\\Users\\00.txt.";
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======

>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
}
