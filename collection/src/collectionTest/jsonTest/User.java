package collectionTest.jsonTest;

import java.util.Objects;

public class User {
//	id, name, age, job
	private Long id;
	private String name, job;
	private int age;
	
	public User() {;}
	public User(Long id, String name, String job, int age) {
		this.id = id;
		this.name = name;
		this.job = job;
		this.age = age;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", job=" + job + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, id, job, name);
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
		return age == other.age && Objects.equals(id, other.id) && Objects.equals(job, other.job)
				&& Objects.equals(name, other.name);
	}
	
}
