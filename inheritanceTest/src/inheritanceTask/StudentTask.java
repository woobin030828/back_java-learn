package inheritanceTask;

class StudentTask extends PersonTask {
	String instaId;

	public StudentTask() {;}
	public StudentTask(String name, int age, String address, String phone, String instaId) {
		super(name, age, address, phone);
		this.instaId = instaId;
	}

	@Override
	void work() {
		System.out.println("아르바이트를 하다.");
	}
	
	@Override
	void sleep() {
		System.out.println("수업 시간에 잠을 자다.");
	}
	
	@Override
	void eat() {
		System.out.println("아침을 거른다.");
	}
}