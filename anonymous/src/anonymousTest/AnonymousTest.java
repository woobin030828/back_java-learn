package anonymousTest;

//	익명 내부 클래스
public class AnonymousTest {
	public static void main(String[] args) {
		Study study = new Study() {
			
			@Override
			public String setTopic(String topic) {
				return topic;
			}
		};
		
		study.setTopic("테스트");
	}
}
