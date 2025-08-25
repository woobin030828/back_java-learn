package inheritanceTask;

public class PersonTask {
	String name, address, phone;
	int age;

	public PersonTask() {;}
	public PersonTask(String name, int age, String address, String phone ) {
		super();
	}

	void work() {
		System.out.println("일을 하다.");
	}
	
	void sleep() {
		System.out.println("잠을 자다.");
	}
	
	void eat() {
		System.out.println("세 끼를 먹는다.");
	}
}
