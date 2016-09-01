package local.sia._7SpringMVC.domain;

import org.springframework.stereotype.Repository;

@Repository
public class Spitter {
	
	private String username;
	private String password;
	private String fullname;
	private String email;
	private boolean update_by_email;
	
	
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
