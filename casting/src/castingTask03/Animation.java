package castingTask03;

class Animation extends Netflix {

	public Animation() {;}

	public Animation(String name, int time, double score) {
		super(name, time, score);
	}
	
	@Override
	void play() {
		System.out.println("애니메이션을 재생했습니다.");
	}
	
	void displaySub() {
		System.out.println("해당 콘텐츠는 자막 기능을 지원합니다.");
	}
	
}
