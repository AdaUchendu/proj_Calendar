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

}
