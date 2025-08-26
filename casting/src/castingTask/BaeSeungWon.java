package castingTask;
class BaeSeungWon {
	String name, hobby;
	int age;

	public BaeSeungWon() {;}
	public BaeSeungWon(String name, String hobby, int age) {
		this.name = name;
		this.hobby = hobby;
		this.age = age;
	}

	void play(Friends friend) {
		if (friend instanceof Pororo) {
			friend.withPlay();
			
			
		} else if (friend instanceof Loppy) {
			friend.withPlay();
			Loppy loppy = (Loppy)friend;
			loppy.eatingPie();
			
		} else if (friend instanceof Crong) {
			friend.withPlay();
			Crong crong = (Crong)friend;
			crong.speak();
		}
	};
	
}
