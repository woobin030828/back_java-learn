package castingTask04;



// 결과 확인
public class CastingTask04 {
	public static void main(String[] args) {
		User[] users = {
			new MarketMember("우빈", "010-7255-7854", 30000, 32, 6), 
			new MarketNonMember("우빈", "010-7255-7854", 24000, 19, 3), 
			new MarketNonMember("빌게이츠", "010-7255-7854", 600_000_000, 8, 0)
		};
		
		users[2].buy("막대사탕", 5);
		users[0].buy("막대사탕", 1);
		users[0].buy("막대사탕", 1);
		users[0].buy("막대사탕", 1);
		
	}
}
