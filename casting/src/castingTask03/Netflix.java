package castingTask03;

class Netflix {
	private String name;
	private int time;
	private double score;
	
	public Netflix() {;}
	public Netflix(String name, int time, double score) {
		this.name = name;
		this.time = time;
		this.score = score;
	}
	
	void play() {
		System.out.println("미분류를 재생하였습니다.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public double getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
