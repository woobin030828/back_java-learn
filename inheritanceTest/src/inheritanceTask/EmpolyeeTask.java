package inheritanceTask;

class EmpolyeeTask extends PersonTask {
	int money;
	
	public EmpolyeeTask() {;}
	public EmpolyeeTask(String name, int age, String address, String phone, int money) {
		super(name, age, address, phone);
		this.money = money;
	}
	@Override
	void work() {
		System.out.println("하루종일 잠을 자다.");
	}
	@Override
	void sleep() {
		System.out.println("잠을 설치다.");
	}
	@Override
	void eat() {
		System.out.println("야식을 먹는다.");
	}
}