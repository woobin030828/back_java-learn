package optionalTest;

import java.util.Objects;

public class User {
	private Long id;
	private String userName, userEmail, userPassword;
	private static Long seq;
	
	public User() {;}
	public User(String userName, String userEmail, String userPassword) {
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}
	
	static {
		seq = 1L;
	}
	
	{
		this.id = seq++;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public static Long getSeq() {
		return seq;
	}
	public static void setSeq(Long seq) {
		User.seq = seq;
	}
	@Override
	public String toString() {
		return "OptionalTest [id=" + id + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, userEmail, userName, userPassword);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id) && Objects.equals(userEmail, other.userEmail)
				&& Objects.equals(userName, other.userName) && Objects.equals(userPassword, other.userPassword);
	}

	
	
	
	
}
