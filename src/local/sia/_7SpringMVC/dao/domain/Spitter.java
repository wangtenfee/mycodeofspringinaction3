package local.sia._7SpringMVC.dao.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Spitter {
	
	private long id;
	@Size(min=3, max=20, message="Username must be between 3 and 20 characters long.")
	@Pattern(regexp="^[a-zA-Z0-9]+$",message="Username must be alphanumeric with no spaces")
	private String username;
	@Size(min=6, max=20,message="The password must be at least 6 characters long.")
	private String password;
	@Size(min=3, max=50, message="Your full name must be between 3 and 50 characters long.")
	private String fullname;
	
	@Pattern(regexp="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}",message="Invalid email address.")
	private String email;
	private boolean update_by_email;
	
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isUpdate_by_email() {
		return update_by_email;
	}
	public void setUpdate_by_email(boolean update_by_email) {
		this.update_by_email = update_by_email;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	
}
