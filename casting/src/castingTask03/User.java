package castingTask03;

class User {
	private String name; // 사용자 이름
	private int videoCount; // 비디오 시청수
	
	public User() {;}
	public User(String name, int videoCount) {
		super();
		this.name = name;
		this.videoCount = videoCount;
	}
	
	void watchMoive(Netflix netflix) {
		netflix.play();
		videoCount++;
		if (netflix instanceof Animation) {
			Animation animation = (Animation)netflix;
			animation.displaySub();
		} else if(netflix instanceof Drama) {
			Drama drama = (Drama)netflix;
			drama.goods();
		} else if(netflix instanceof Movie) {
			Movie movie = (Movie)netflix;
			movie.hyperReal();
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVideoCount() {
		return videoCount;
	}

	public void setVideoCount(int videoCount) {
		this.videoCount = videoCount;
	}
	
	
}
