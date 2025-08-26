package castingTask02;

class Humen extends Monstar {

	public Humen() {;}

	{
		this.name = "인간";
		this.age = 23;
	}
	
	public Humen(String name, int age) {
		super(name, age);
	}
	
	@Override
	void hunt() {
		System.out.println("인간은 골드를 떨어뜨렸다.");
	}
	
	void clise() {
		System.out.println("해치웠나?");
	}

	
}
