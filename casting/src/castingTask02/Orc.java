package castingTask02;

class Orc extends Monstar {

	public Orc() {;}
	public Orc(String name, int age) {
		super(name, age);
	}
	
	{
		this.name = "오크";
		this.age = 3;
	}
	
	
	@Override
	void hunt() {
		System.out.println("오크는 도끼를 떨어뜨렸다.");
	}
	
	void kill() {
		System.out.println("콜록");
	}
}
