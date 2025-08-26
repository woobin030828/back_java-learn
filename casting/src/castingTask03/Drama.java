package castingTask03;

class Drama extends Netflix {

	public Drama() {;}

	public Drama(String name, int time, double score) {
		super(name, time, score);
	}
	
	@Override
	void play() {
		System.out.println("드라마를 재생했습니다.");
	}
	
	void goods() {
		System.out.println("해당 콘텐츠에는 현재 한정 굿즈가 있습니다");
	}
}
