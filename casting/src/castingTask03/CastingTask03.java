package castingTask03;

import java.util.Scanner;

//넷플릭스
//재생 메서드
//애니메이션, 영화, 드라마 클래스 선언
//사용자가 선택한 영상이
//애니메이션이라면 "자막 지원" 기능 사용
//영화라면 "4D" 기능 사용
//드라마라면 "굿즈" 기능 사용

public class CastingTask03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User("우빈 초이", 0);
		Netflix[] netfilxVideos = {new Animation("이웃집_토토로",89 , 5.0), new Drama("태양의_후예", 5, 3.2), new Movie("어벤져스", 67, 4)};
		String inputMessage = "시청할 콘텐츠를 입력하세요. (*이웃집_토토로, *태양의_후예, *어벤져스, 다른 값 입력 시 즉시 종료) : ", selectString = "";
		boolean isContine = false;
		
		isContine = true;
		while (isContine) {
			System.out.println(inputMessage);
			selectString = sc.next();
			boolean found = false;
			for (Netflix netfilx: netfilxVideos) {
				if (selectString.equals(netfilx.getName())) {					
					user.watchMoive(netfilx);
					found = false;
					break;
				} 
				if (!found) {
					isContine = false;
				}
			}
		}
		System.out.printf("오늘의 시청 수: %d", user.getVideoCount());
		sc.close();
	}
}
