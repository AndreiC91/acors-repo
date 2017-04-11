package jpa.entities;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Transactional
@Table (name="users")
@NamedQuery(name = User.FIND_BY_USERNAME, query = "SELECT u FROM User u WHERE u.username = ?1")
public class User {
	
	public static final String FIND_BY_USERNAME = "User.findByUsername";
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private int id;
	
	@Column(name="username", length=30, nullable=false)
	private String username; 
	@Column(name="password", length=20, nullable=false)
	private String password;
	
	@Column(name="isavailable", nullable=false)
	private boolean isAvailable = true; // default 1
	
	@Column(name="first_name", length=50, nullable=true)
	private String first_name; 
	@Column(name="last_name", length=50, nullable=true)
	private String last_name;
	
	@Column(name="showname", nullable=false)
	private boolean showName = false; // default 0
	
	@Column(name="points", nullable=false)
	private int points; // default 0
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public boolean getShowName() {
		return showName;
	}

	public void setShowName(boolean showName) {
		this.showName = showName;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
}
