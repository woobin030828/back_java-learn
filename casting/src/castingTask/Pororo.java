package castingTask;

class Pororo extends Friends {
	public Pororo() {;}
	public Pororo(String name, int age) {
		super(name, age);
	}

	@Override
	void withPlay() {
		System.out.println("눈싸움을 한다.");
	};
}