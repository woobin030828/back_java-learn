package castingTask03;

class Movie extends Netflix {

	public Movie() {;}

	public Movie(String name, int time, double score) {
		super(name, time, score);
	}
	
	@Override
	void play() {
		System.out.println("영화를 재생했습니다.");
	}
	
	void hyperReal() {
		System.out.println("해당 콘텐츠는 4D 기능을 지원합니다.");
	}
}
