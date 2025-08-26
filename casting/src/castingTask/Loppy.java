package castingTask;

class Loppy extends Friends {
	public Loppy() {;}
	public Loppy(String name, int age) {
		super(name, age);
	}

	@Override
	void withPlay() {
		System.out.println("군침이 싹 돈다.");
	};
	
	void eatingPie() {
		System.out.println("파이를 먹는다.");
	}
}