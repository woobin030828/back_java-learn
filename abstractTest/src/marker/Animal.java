package marker;

public class Animal {
//	이름, 나이, 먹이
	private String name, feed;
	private int age;
	
	public Animal() {;}
	public Animal(String name, String feed, int age) {
		this.name = name;
		this.feed = feed;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFeed() {
		return feed;
	}
	public void setFeed(String feed) {
		this.feed = feed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
