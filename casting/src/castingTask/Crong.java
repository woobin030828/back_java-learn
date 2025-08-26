package castingTask;

class Crong extends Friends {
	public Crong() {;}
	public Crong(String name, int age) {
		super(name, age);
	}

	@Override
	void withPlay() {
		System.out.println("블럭 놀이를 한다.");
	};
	
	void speak() {
		System.out.println("크롱이랑 말을 한다.");
	}
}
