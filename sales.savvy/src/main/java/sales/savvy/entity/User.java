package sales.savvy.entity;

import jakarta.persistence.*;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String username;
	private String email;
	private String password;
	private String dob;
	private String gender;
	private String role;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long id, String username, String email, String password, String dob, String gender, String role) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.gender = gender;
		this.role = role;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + ", dob="
				+ dob + ", gender=" + gender + ", role=" + role + "]";
	}
	
	
}
