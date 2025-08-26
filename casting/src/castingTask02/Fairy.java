package castingTask02;

class Fairy extends Monstar {

	public Fairy() {;}
	public Fairy(String name, int age) {
		super(name, age);
	}
		
	{
		this.name = "요정";
		this.age = 5000;
	}
	
	@Override
	void hunt() {
		System.out.println("요정은 팬던트를 떨어뜨렸다.");
	}
	
	void tears() {
		System.out.println("ㄴr는ㄱr끔 눈물을 흘린ㄷr...");
	}

	
}
